/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-04-26 03:00:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findId_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/signUp.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: 'Montserrat', sans-serif;\n");
      out.write("  transition: 3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-container {\n");
      out.write("  height:400px;\n");
      out.write("  margin-top: 10%;\n");
      out.write("\n");
      out.write("  border-radius: 5px;\n");
      out.write("  /* box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19); */\n");
      out.write("  max-width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ads {\n");
      out.write("  background-color: #A569BD;\n");
      out.write("  border-top-left-radius: 5px;\n");
      out.write("  border-bottom-left-radius: 5px;\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ads h1 {\n");
      out.write("  margin-top: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#fl {\n");
      out.write("  font-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#sl {\n");
      out.write("  font-weight: 100 !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile-img {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".profile-img img {\n");
      out.write("  border-radius: 50%;\n");
      out.write("  /* animation: mymove 2s infinite; */\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes mymove {\n");
      out.write("  from {border: 1px solid #F2F3F4;}\n");
      out.write("  to {border: 8px solid #F2F3F4;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".find-detail {\n");
      out.write("\n");
      out.write("  padding: 15px;\n");
      out.write("  border: 1px solid #CCD1D1;\n");
      out.write("  border-radius: 5px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form h3 {\n");
      out.write("  text-align: center;\n");
      out.write("  padding-top: 15px;\n");
      out.write("  padding-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form .find_id {\n");
      out.write("	background-color : #ffeded;\n");
      out.write("	color : #abbcae;\n");
      out.write("	font-size : 15px;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write(".login-form .forget-password a{\n");
      out.write("	color : #abbcae;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".find-detail{\n");
      out.write("  padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control {\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".forget-password a {\n");
      out.write("  font-weight: 500;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input::placeholder{\n");
      out.write("	color: #abbcae;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bt-signup{\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 10px;\n");
      out.write("  border: 1px solid #CCD1D1;\n");
      out.write("  padding: 5px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bt-signup p{\n");
      out.write("  font-size: 13px;\n");
      out.write("  color: #abbcae;\n");
      out.write("  display: inline-block;\n");
      out.write("  margin-top: 15px;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bt-signup button{\n");
      out.write("\n");
      out.write("  margin-left: 10px;\n");
      out.write("  width: 80px;\n");
      out.write("  border: 1px solid #abbcae;\n");
      out.write("  background-color: white;\n");
      out.write("  color: #abbcae;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".row{\n");
      out.write("	justify-content: center;\n");
      out.write("}\n");
      out.write(".login_logo{\n");
      out.write("	align-self:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login_warn{\n");
      out.write("	margin-top:30px;\n");
      out.write("	text-align:center;\n");
      out.write("	color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".idCheck1{\n");
      out.write("	color: #abbcae;\n");
      out.write("	display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".idCheck2{\n");
      out.write("	color: red;\n");
      out.write("	display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#mail_check_input_box_false{\n");
      out.write("    background-color:#ebebe4;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("#mail_check_input_box_true{\n");
      out.write("    background-color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".correct{\n");
      out.write("    color : green;\n");
      out.write("}\n");
      out.write(".incorrect{\n");
      out.write("    color : red;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".mail_check_button {\n");
      out.write("  margin-top: 10px;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".mail_check_button .go_findPw{\n");
      out.write("  padding: 5px 10px;\n");
      out.write("  font-size: 13px;\n");
      out.write("  background-color: white;\n");
      out.write("  color: #abbcae;;\n");
      out.write("  border: 1px solid #abbcae;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".findPw{\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".findPw p{\n");
      out.write("  font-size: 12px;\n");
      out.write("  color:#767c779b;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".findPw i{\n");
      out.write("	font-size:25px;\n");
      out.write("	color : #abbcae;\n");
      out.write("}\n");
      out.write("#findIdBtn{\n");
      out.write("	margin-top:20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("       <div class=\"col-md-4 block text-center mt-4 login_logo\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4 login-form login-container\">\n");
      out.write("          <form class=\"find-detail\" id=\"findIdForm\" method=\"post\" action=\"/member/findId_result\">\n");
      out.write("            <h3><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/logo_text.png\" alt=\"\"></h3>\n");
      out.write("            <div class=\"findPw\">\n");
      out.write("              <i class=\"fas fa-unlock-alt\"></i>\n");
      out.write("              <h4>로그인에 문제가 있나요?</h4>\n");
      out.write("              <p>가입했을때의 사용자 아이디, 사용자 이름을 입력하시면 <br> 가입한 이메일의 일부를 보여드립니다</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("             	 <input type=\"text\" class=\"form-control id_input\" id=\"id\" name=\"id\" placeholder=\"가입한 아이디를 입력해주세요\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("             	 <input type=\"text\" class=\"form-control id_name\" id=\"name\" name=\"name\" placeholder=\"가입한 이름을 입력해주세요\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("              <div class=\"mail_check_button\">\n");
      out.write("              	<button type=\"button\" onclick=\"location.href=('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/findPw');\"  class=\"go_findPw\">비밀번호 찾으러가기</button>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <button id=\"findIdBtn\" class=\"btn btn-lg btn-block find_id\">아이디 찾기</button>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"form-group bt-signup\">\n");
      out.write("              <p>계정이 없으신가요?</p>\n");
      out.write("              <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/signup\" class=\"btn btn-sm btn-block bt-login\" id=\"register\">회원가입</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("<script>\n");
      out.write("\n");
      out.write("$(document).ready(function(){\n");
      out.write("	var msg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("	if(msg != \"\"){\n");
      out.write("		alert(msg);\n");
      out.write("	}\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("$(\"#findIdBtn\").click(function(e){\n");
      out.write("	\n");
      out.write("  	var id = $('#id').val();\n");
      out.write("  	var name = $('#name').val();\n");
      out.write("	  e.preventDefault();\n");
      out.write("	  if(id == \"\"){\n");
      out.write("		  alert(\"아이디를 입력해주세요\");\n");
      out.write("		  $(\"#email\").focus();\n");
      out.write("		return;\n");
      out.write("	  }else if(name == \"\"){\n");
      out.write("		  alert(\"이름을 입력해주세요\");\n");
      out.write("		  $(\"#id\").focus();\n");
      out.write("			return;\n");
      out.write("	  }\n");
      out.write("	  \n");
      out.write("	if(confirm(\"아이디를 찾으시겠습니까?\")){\n");
      out.write("		$(\"#findIdForm\").submit();\n");
      out.write("		return false;\n");
      out.write("	}\n");
      out.write("})\n");
      out.write(" \n");
      out.write("  \n");
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
