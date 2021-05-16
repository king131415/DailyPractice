using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace Airplan
{
    class DBHelper
    {

        //数据库连接字符串
        private string connString = @"Data Source=DESKTOP-I59EU9B;Initial Catalog=AirplanSystem;Integrated Security=True";
        //数据库连接Connection 对象
        private SqlConnection connection;

        public SqlConnection Connection
        {
            get
            {
                if(connection==null)
                {
                    connection =new SqlConnection(connString);
                }
                return connection;
            }
        }
        public void OpenConnection()//打开数据库连接
        {
            if(Connection.State == ConnectionState.Closed)
            {
                Connection.Open();
            }else if(Connection.State==ConnectionState.Broken)
            {
                connection.Close();
                connection.Open();
            }
        }
        //关闭数据库连接
        public void CloseConnection()
        {
            if(Connection.State==ConnectionState.Open || Connection.State== ConnectionState.Broken)
            {
                connection.Close();
            }
        }
    }
}
