package huyuwen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class copy {

	public static void  copyFile(String oldPath, String newPath) {
		// TODO �Զ����ɵķ������
		 try {  
	            int bytesum = 0;  
	            int byteread = 0;  
	            File oldfile = new File(oldPath);  
	            if (oldfile.exists()) {  
	                InputStream inStream = new FileInputStream(oldPath);   
	                FileOutputStream fs = new FileOutputStream(newPath);  
	                byte[] buffer = new byte[1444];  
	                while ( (byteread = inStream.read(buffer)) != -1) {  
	                    bytesum += byteread;  
	                    System.out.println(bytesum);  
	                    fs.write(buffer, 0, byteread);  
	                }  
	                inStream.close();  
	                fs.close();
	                System.out.println("�ļ��������");  
	            }  
	        }  
	        catch (Exception e) {  
	            System.out.println("���Ƶ����ļ���������");  
	            e.printStackTrace();  
	        }
	        
	    }
	    
	    public static void main(String[] args) {
	        String newPath="D:\\workspace\\task1\\target\\Lesson10.ppt";
	        String oldPath="D:\\workspace\\task1\\share\\Lesson10.ppt";
	        copy.copyFile(oldPath, newPath);


	}

}
