package userdetails;
import java.io.*;
class logdetails implements Serializable
{
		String username;
		String password;
}

public class user  extends logdetails
{
	public void ReadData(String user,String pass) throws Exception
	{
				FileOutputStream fis = new FileOutputStream("userdet");
				ObjectOutputStream oos = new ObjectOutputStream(fis);
				logdetails obj = new logdetails();
				obj.username=user;
				obj.password=pass;
				oos.writeObject(obj);
				oos.close();
				fis.close();
	}

	public Boolean verify(String name,String pass) throws Exception
	{
				ObjectInputStream oos = new ObjectInputStream(new FileInputStream("userdet"));
				logdetails obj2 = new logdetails();
				obj2 = (logdetails)oos.readObject();
				
				if((obj2.username).equalsIgnoreCase(name)&&(obj2.password).equalsIgnoreCase(pass))
				{
						return true;
				}
				else{
						return false;
				}
				
	}
}