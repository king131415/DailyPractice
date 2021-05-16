using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Airplan
{
    public partial class FrmLogin : Form
    {
        public FrmLogin()
        {
            InitializeComponent();
        }
        //登录
        private void button1_Click(object sender, EventArgs e)
        {
            if(yanZheng())//验证非空
            {
                DBHelper db = new DBHelper();
                string sql=string.Format("select count(*) from 客户信息表 wher name='{0}' and ")

            }
        }
        public bool yanZheng()
        {
            if(this.textname.Text.Equals(string.Empty))
            {
                MessageBox.Show("用户名不能为空！","温馨提示！" ,MessageBoxButtons.OK,MessageBoxIcon.Warning);
                return false;
            }else if(this.textpassword.Text.Equals(string.Empty))
            {

                MessageBox.Show("密码不能为空！", "温馨提示！", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return false;
            }else
            {
                return true;
            }

        }
    }
}
