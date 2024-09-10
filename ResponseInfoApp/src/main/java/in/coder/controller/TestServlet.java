package in.coder.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/img")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\ineuron\\PracticeServlet\\ResponseInfoApp\\src\\ayush.jpg");
		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = new byte[(int) file.length()];
		fis.read(b);//reading into byte[] through inputstream
		
		ServletOutputStream stream = response.getOutputStream();
		stream.write(b);//writing from byte[] to response
		
		stream.flush();
		stream.close();
		
		fis.close();
		
	}

}
