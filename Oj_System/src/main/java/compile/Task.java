package compile;

import Utils.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
//用这个类来表示一次完整的编译运行的过程
public class Task {
    //所有的临死文件要放到这个目录中
    private String WORK_DIR;
    //要编辑执行的类的名字，影响到源代码的文件名
    private String CLASS="Solution";
    //要编译执行的文件名
    private String CODE;
    //程序标准输出放置的位置
    private String STDOUT;
    //程序标准错误放置的位置
    private String STDERR;
    //程序的编译出错存放的文件
    private  String COMPILE_ERROR;

    public Task() {
       WORK_DIR="./tmp/"+ UUID.randomUUID().toString()+"/";
       CODE=WORK_DIR+CLASS+".java";
       STDOUT=WORK_DIR+"stdout.txt";
       STDERR=WORK_DIR+"stderr.txt";
       COMPILE_ERROR=WORK_DIR+"compile_error.txt";
    }
    public Answer complieAndRun(Question question) throws IOException, InterruptedException {
        Answer answer=new Answer();
        File file=new File(WORK_DIR);
        if(!file.exists()){
            file.mkdirs();
        }
        //准备好要编译的源代码文件
        FileUtil.writeFile(CODE,question.getCode());
        //构造预编译指令
        String compileCmd=String.format("javac -encoding utf-8 %s -d %s",CODE,WORK_DIR);

        System.out.println(compileCmd); //打印编辑命令

       //执行预编译指令
        CommandUtil.run(compileCmd,null,COMPILE_ERROR);

        String compileError=FileUtil.readFile(COMPILE_ERROR);
        if(!compileError.equals("")){
            answer.setErrno(1);
            answer.setReason(compileError);
            return answer;
        }
        String runCmd=String.format("java -classpath %s %s",WORK_DIR,CLASS);
        System.out.println(runCmd);

        CommandUtil.run(runCmd,STDOUT,STDERR);

        String runError=FileUtil.readFile(STDERR);
        if(!runError.equals("")){
            answer.setErrno(2);
            answer.setReason(runError);
            return answer;
        }
        answer.setErrno(0);
        String runStdout=FileUtil.readFile(STDOUT);
        answer.setStdout(runStdout);
        return answer;

    }

    public static void main(String[] args) {
        Task task=new Task();
        Question question=new Question();
        
    }
}
