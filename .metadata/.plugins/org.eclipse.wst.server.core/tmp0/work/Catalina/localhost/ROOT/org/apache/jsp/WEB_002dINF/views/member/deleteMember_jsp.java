/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-04-26 02:53:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/header.jsp", out, false);
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	input #nowPw{\n");
      out.write("		border: 1px solid black;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"fade\" id=\"profileModifyModal\" tabindex=\"-1\"\n");
      out.write("		role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("		<div class=\"modal-dialog modal-dialog-centered modal-lg\" style=\"width: 700px;\"\n");
      out.write("			role=\"document\">\n");
      out.write("			<form class=\"modal-content p-3\" style=\"flex-direction: row; flex-wrap: wrap; border-radius: 10px;\">\n");
      out.write("				<div class=\"col-10 m-auto d-flex flex-row flex-wrap\" name=\"clubcreate-form\" id=\"clubcreate-form\">\n");
      out.write("					<div class=\"col-12 h-25 my-4 d-flex flex-column align-items-start\">\n");
      out.write("						<label class=\"memberModify\" for=\"deleteCheck\">회원탈퇴 확인</label>\n");
      out.write("						<p class=\"col-12 h-0 border-0 border-bottom\" type=\"text\" id=\"memberModify\" name=\"memberModify\"></p>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-6 d-flex flex-column p-3 pt-0 align-items-start\">\n");
      out.write("						<input type=\"hidden\" name=\"email\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("						\n");
      out.write("						\n");
      out.write("						<label class=\"py-2 col-12 nameModify\" for=\"pw\">현재 비밀번호 확인<i class=\"fas fa-seedling\"></i></label>\n");
      out.write("						<input type=\"password\" class=\"border col-12\" type=\"text\" id=\"pw\" name=\"pw\"/>\n");
      out.write("						<span id=\"pwCheckMsg\"></span>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-12 d-flex justify-content-end pe-3 py-1 mb-2\">\n");
      out.write("						<button class=\"p-1 px-3 btn border-0 delete_member\">탈퇴하기</button>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(\"#deleteMember\").click(function(e){\n");
      out.write("	  \n");
      out.write("	\n");
      out.write("	\n");
      out.write("})\n");
      out.write("\n");
      out.write("\n");
      out.write("	\n");
      out.write("$('.delete_member').click(function(e){\n");
      out.write("	const checkPassword = $('#pw').val();\n");
      out.write("    if(!checkPassword || checkPassword.trim() === \"\"){\n");
      out.write("        alert(\"비밀번호를 입력하세요.\");\n");
      out.write("        return false;\n");
      out.write("    } else if(confirm(\"작성한 게시물 및 모든 데이터가 지워집니다 회원탈퇴를 진행하시겠습니까?\")){\n");
      out.write("    	$.ajax({\n");
      out.write("    		url : 'deleteMember',\n");
      out.write("    		method : 'delete'\n");
      out.write("    	})\n");
      out.write("    	alert('회원 탈퇴가 완료되었습니다');\n");
      out.write("		window.location.href = '/member/login'\n");
      out.write("	}\n");
      out.write("})\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
