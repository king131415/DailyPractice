
function filler(arr,fn) {
    var temp=[];  //定义一个零时数组
   for (var i=0;i<arr.length;i++){
       if(fn(arr[i])){
           temp.push(arr[i]); //调用数组本身自己的方法
       }
   }
   return temp; //返回数组
}
var str="123";
var arr=[1,2,4,5,6,7,9];  //数组的定义
console.log(arr);
console.log("-------华丽的分割线！！！");
console.log(Number(str)) //字符串转数字
var b= filler(arr,function (a) {  //JS方法的参数可以是一个方法，这种方法的调用称为回调函数
     return a>3;
})
console.log(b);
console.log("-------华丽的分割线！！！");
console.log(Math.abs(-6646)); //绝对值
console.log("-------华丽的分割线！！！");
console.log(Math.ceil(12.3));//向上取整
console.log("-------华丽的分割线！！！");
console.log(Math.floor(12.3));//向下取整
console.log("-------华丽的分割线！！！");
console.log(Math.round(12.6));//四舍五入
console.log("-------华丽的分割线！！！");
console.log(Math.random()*10+20);
console.log("-------华丽的分割线！！！");

let date=new Date();  //时间函数
console.log(date.toLocaleTimeString()); //显示当地当时时间
