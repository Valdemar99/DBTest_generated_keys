package test.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.ejb.Video;
import test.facade.FacadeLocal;

/**
 * Servlet implementation class VideoClient
 */
@WebServlet("/VideoClient")
public class VideoClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private FacadeLocal facade;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head>");
		out.println("<title>Technological Unemployment</title>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("</head><body>");
		
		out.println("<h2>Technological unemployment</h2>");
		out.println("<h2>Smart Office 2.0</h2>");
		Video vid = new Video();
		vid.setTitle("Awesome Lockdown Ideas");
		vid.setDuration(2394);
		vid.setVideoURL("https://www.youtube.com/watch/v?223nskwv829sl/");
		try {
			facade.createVideo(vid);
			out.println("<h2>Success!</h2>");
		} catch(Exception ex) {
			out.println("<h2>Error</h2>");
			out.println("<p>" + ex.getMessage() + "</p>");
		}
		
		
	}

}
