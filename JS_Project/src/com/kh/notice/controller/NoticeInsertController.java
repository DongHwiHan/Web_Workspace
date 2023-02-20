package com.kh.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.vo.Member;
import com.kh.notice.model.service.NoticeService;
import com.kh.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeInsertController
 */
@WebServlet("/insert.no")
public class NoticeInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		request.getParameter("NOTICE_CONTENT");
//		request.getParameter("NOTICE_TITLE");
		
//		NOTICE_NO ,
//		NOTICE_TITLE , 
//		NOTICE_CONTENT , 
//		NOTICE_WRITER
		
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String userNo = request.getParameter("userNo");
		
		  Notice n = new Notice();
		  n.setNoticeTitle(title);
		  n.setNoticeContent(content);
		  n.setNoticeWriter(userNo);

		
		int result = new NoticeService().insertNotice(n);
		
        if(result > 0) { 
        	 request.getSession().setAttribute("alertMsg", "공지사항등록에 성공하였습니다.");
            //response.sendRedirect(request.getContextPath()+"/list.no");
            
            // 글작성에 성공했을때 내가 작성한 게시글로 곧바로 이동
            response.sendRedirect(request.getContextPath()+"/detail.no?nno=" + result);
         }else { 
        	 request.setAttribute("errorMsg", "공지사항등록에 실패하였습니다.");
            request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
         }
		
		
	}

}
