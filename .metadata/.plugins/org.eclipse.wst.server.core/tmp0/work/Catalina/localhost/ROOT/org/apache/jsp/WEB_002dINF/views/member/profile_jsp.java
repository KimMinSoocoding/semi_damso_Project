/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2023-04-26 03:06:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1669273540242L));
    _jspx_dependants.put("jar:file:/Users/minsoo/Desktop/team/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sns_damso/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/header.jsp", out, false);
      out.write("\n");
      out.write("<link\n");
      out.write("		href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/styleBoard_230407.css\"\n");
      out.write("		rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<style>\n");
      out.write("	a {\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("	.feed-main {\n");
      out.write("		display :flex;\n");
      out.write("		justify-content: center;\n");
      out.write("	}\n");
      out.write("	.myfeed {\n");
      out.write("		max-width: 620px;\n");
      out.write("	}\n");
      out.write("	.story {\n");
      out.write("		height: auto;\n");
      out.write("		display: flex;\n");
      out.write("		padding: 45px 0 20px;\n");
      out.write("		justify-content: space-around;\n");
      out.write("	}\n");
      out.write("	.myinfo {\n");
      out.write("		width: 250px;\n");
      out.write("		height: 400px;\n");
      out.write("	}\n");
      out.write("	.story-img, .media .info-img {\n");
      out.write("		width: 60px;\n");
      out.write("		height: 60px;\n");
      out.write("		border-radius: 50%;\n");
      out.write("		border: white 2px solid;\n");
      out.write("		padding: 0;\n");
      out.write("	}\n");
      out.write("	.story-active {\n");
      out.write("		width: 64px;\n");
      out.write("		height: 64px;\n");
      out.write("		border-radius: 50%;\n");
      out.write("		border: #cceabf 2px solid;\n");
      out.write("	}\n");
      out.write("	.myboard {\n");
      out.write("		width : 470px;\n");
      out.write("		margin: auto;\n");
      out.write("		padding-top: 30px;\n");
      out.write("	}\n");
      out.write("	.board-btnbox {\n");
      out.write("		margin: 0;\n");
      out.write("		padding: 10px;\n");
      out.write("	}\n");
      out.write("	.board-btnbox li {\n");
      out.write("		padding-right: 8px;\n");
      out.write("	}\n");
      out.write("	.board-btnbox li:nth-of-type(4) {\n");
      out.write("		float : right;\n");
      out.write("		padding-right: 0;\n");
      out.write("		margin-right: -23px;\n");
      out.write("	}\n");
      out.write("	.reply-view, .reply-add {\n");
      out.write("		color: #757575;\n");
      out.write("		font-size: 15px;\n");
      out.write("	}\n");
      out.write("	.reply-view p {\n");
      out.write("		padding: 5px 0 10px;\n");
      out.write("		margin:0;\n");
      out.write("	}\n");
      out.write("	.reply-add {\n");
      out.write("		border: none;\n");
      out.write("		width: 100%;\n");
      out.write("		margin-left: -2px;\n");
      out.write("		padding-bottom: 10px;\n");
      out.write("	}\n");
      out.write("	.feed-writer, .reply-view:hover, .feed-writer:hover {\n");
      out.write("		color: #fdb3b6;\n");
      out.write("	}\n");
      out.write("	.reply-addbtn {\n");
      out.write("		float: right;\n");
      out.write("		background-color: white;\n");
      out.write("		border: none;\n");
      out.write("		cursor: pointer;\n");
      out.write("		color: #757575;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	.write-img {\n");
      out.write("		border: none !important;\n");
      out.write("		border-radius: 50%;\n");
      out.write("		width: 30px !important;\n");
      out.write("		height: 30px !important;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	textarea {\n");
      out.write("		border: none;\n");
      out.write("		width: 100%;\n");
      out.write("		height: 300px;\n");
      out.write("		padding: 10px 15px;\n");
      out.write("		resize: none;\n");
      out.write("		border-bottom: #e9ecef solid 1px;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	.write-option {\n");
      out.write("		height: 40px;\n");
      out.write("		border-bottom: solid 1px #e9ecef;\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.modalscroll {\n");
      out.write(" 		overflow-x: hidden; \n");
      out.write(" 		overflow-y: auto;\n");
      out.write("  		height: 412.11px;\n");
      out.write(" 	}\n");
      out.write(" 	\n");
      out.write(" 	.modalscroll::-webkit-scrollbar {\n");
      out.write("		display: none; /* Chrome, Safari, Opera*/\n");
      out.write("	}\n");
      out.write("	.search-main img {\n");
      out.write("		width: 100%;\n");
      out.write("		height: auto;\n");
      out.write("	}\n");
      out.write("	.profileTab {\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("	.modal-heade {\n");
      out.write("	    text-align: center;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.memberModify, .intro, .idModify, .nameModify {\n");
      out.write("		color: #abbcae;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.modifyComplete{\n");
      out.write("		background-color: #ffeded;\n");
      out.write("		color: #abbcae;\n");
      out.write("		font-size : 14px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.passwordModify{\n");
      out.write("		margin-top:12px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.passwordModify a{\n");
      out.write("		color: #abbcae;\n");
      out.write("		border : 1px solid #abbcae;\n");
      out.write("		padding : 5px;\n");
      out.write("		border-radius: 4px;\n");
      out.write("		font-size : 12px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div class=\"search-container d-flex flex-column h-100 w-100 align-items-center\">\n");
      out.write("\n");
      out.write("	<div class=\"col-12 search-main px-3\">\n");
      out.write("		<div class=\"col-12 d-flex flex-column px-4 justify-content-around\" style=\"height:400px\">\n");
      out.write("			<!-- 추후 반응형 작업 필요 -->\n");
      out.write("			<div class=\"d-flex flex-row align-items-center px-5 mt-4\">\n");
      out.write("				<!-- 이때 우리 이미지는 전부 1:1로 저장되기때문에 추후에 height auto로 바꾸기!!!! 안바꾸면 반응형에서 찌그러짐 -->\n");
      out.write("				<img class=\"col-3 ms-4\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/attach.jpg\"\n");
      out.write("					style=\"width: 150px; height:150px; border-radius:50%\">\n");
      out.write("				<div class=\"col-9 d-flex flex-column align-items-start pb-2 ps-4 ms-5\">\n");
      out.write("					<div class=\"fs-5 pb-2 fw-bold profile_id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileEmail.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("						<!-- 본인 프로필인 경우에만 -->\n");
      out.write("						<button class=\"btn border-0 p-2 px-3 ms-5 my-3\" style=\"color:white;background-color:#c0cabf;font-size:13px\" id=\"profileModify\">프로필 편집</button>\n");
      out.write("						<!-- 본인 프로필이 아닌 경우에만 -->\n");
      out.write("						<button class=\"message-btn btn border-0 bg-light p-2 px-3 ms-3 my-3\" style=\"font-size:13px\" id=\"messageSend\">메시지 보내기</button>\n");
      out.write("						<button class=\"btn border-0 bg-light p-2 px-3 ms-3 my-3 addFriend\" style=\"font-size:13px \" id=\"fallow\"><i class=\"fas fa-user-plus\"></i></button>\n");
      out.write("						<i class=\"fas fa-ellipsis-h ms-3 my-3\"></i>  <!-- id=\"fallow\" id=\"addFriend\" -->\n");
      out.write("					</div>\n");
      out.write("					<div class=\"d-flex flex-row pb-3\">\n");
      out.write("						<div class=\"pe-4 me-3\">게시물 <span class=\"fw-bold boardCnt\"></span></div>\n");
      out.write("						<div class=\"pe-4 me-3 \" id=\"followerBtn\" >팔로워 <span class=\"fw-bold\" id =\"followCount\"></span></div>\n");
      out.write("						<div class=\"pe-4 me-3\" id=\"followingBtn\">팔로우 <span class=\"fw-bold\" id =\"followerCount\"></span></div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"pt-3 fw-bold profile_name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileEmail.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <span class=\"ps-2\">음악가 / 밴드</span></div>\n");
      out.write("					<div class=\"pt-2 border-0 col-12 overflow-hidden profile_introl\" style=\"height:60px\" readonly>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileEmail.intro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("				</div>	\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<!-- 프로필 상단 탭 : 기능 수정 가능성 有 -->			\n");
      out.write("			<div class=\"col-12 d-flex flex-row flex-align-center text-center mt-4\" style=\"height:50px\">\n");
      out.write("				<div class=\"profileTab profileTab-board col-4 m-auto py-2 border-bottom border-3\">게시글</div>\n");
      out.write("				<div class=\"profileTab profileTab-club col-4 m-auto py-2 border-bottom\">모임</div>\n");
      out.write("				<!-- <div class=\"col-3 m-auto py-2 border-bottom\">저장됨</div> -->\n");
      out.write("				<div class=\"profileTab profileTab-tag col-4 m-auto py-2 border-bottom\">태그됨</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("		<!-- 게시글 목록 Start -->\n");
      out.write("		<div class=\"profile-board col-12 d-flex mt-1 flex-wrap\">\n");
      out.write("			<!-- 게시글 1 Start -->\n");
      out.write("\n");
      out.write("			<!-- 게시글 1 End -->\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("		<!-- 게시글 목록 End -->\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	");
      out.write("\n");
      out.write("	<!-- 댓글 작성 모달 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- 팔로워 모달 -->\n");
      out.write("<div class=\"modal fade\" id=\"followerModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"followerModalLabel\"\n");
      out.write("    aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-heade\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"followerModalLabel\">팔로워 </h5>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <table id=\"followerTable\" class=\"table table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 팔로우 모달 -->\n");
      out.write("<div class=\"modal fade\" id=\"followingModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"followingModalLabel\"\n");
      out.write("    aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-heade\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"followingModalLabel\">팔로잉 </h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <table id=\"followingTable\" class=\"table table-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write(" \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- 친구추가 -->\n");
      out.write("<div class=\"modal fade\" id=\"addFriendModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"addFriendModalLabel\"\n");
      out.write("     aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"addFriendModalLabel\">친구 추가</h5>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <table id=\"addFriendTable\" class=\"table table-hover\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                               \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 프로필 수정하기 폼 Start -->\n");
      out.write("	<div class=\"modal fade\" id=\"profileModifyModal\" tabindex=\"-1\"\n");
      out.write("		role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("		<div class=\"modal-dialog modal-dialog-centered modal-lg\" style=\"width: 700px;\"\n");
      out.write("			role=\"document\">\n");
      out.write("			<div class=\"modal-content p-3\" style=\"flex-direction: row; flex-wrap: wrap; border-radius: 10px;\">\n");
      out.write("				<div class=\"col-10 m-auto d-flex flex-row flex-wrap\" name=\"clubcreate-form\" id=\"clubcreate-form\">\n");
      out.write("					<div class=\"col-12 h-25 my-4 d-flex flex-column align-items-start\">\n");
      out.write("						<label class=\"memberModify\" for=\"memberModify\">회원수정</label>\n");
      out.write("						<p class=\"col-12 h-0 border-0 border-bottom\" type=\"text\" id=\"memberModify\" name=\"memberModify\"></p>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"club-attach col-6 bg-light mb-4 d-flex justify-content-center align-items-center\" style=\"height: 300px; cursor:pointer\">\n");
      out.write("						<i class=\"fas fa-image fs-3\"></i>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-6 d-flex flex-column p-3 pt-0 align-items-start\">\n");
      out.write("						<label class=\"py-2 col-12 intro\"  for=\"intro\">회원소개 <i class=\"far fa-edit\"></i></label>\n");
      out.write("						<textarea class=\"h-25 border col-12 memberIntro\" id=\"intro\" name=\"intro\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.intro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("						<label class=\"py-2 col-12 idModify\" for=\"idModify\">아이디 수정 <i class=\"fas fa-seedling\"></i></label>\n");
      out.write("						<input class=\"border col-12 \" type=\"text\" id=\"idModify\" name=\"idModify\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("						<label class=\"py-2 col-12 nameModify\" for=\"nameModify\">이름수정 <i class=\"fas fa-seedling\"></i></label>\n");
      out.write("						<input class=\"border col-12\" type=\"text\" id=\"nameModify\" name=\"nameModify\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("						<input type=\"hidden\" id=\"cleader\" name=\"cleader\">\n");
      out.write("						<div class=\"passwordModify\">\n");
      out.write("							<a id=\"password\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/modifyPw\">비밀번호 변경 <i class=\"fas fa-seedling\"></i></a>\n");
      out.write("							<a id=\"deleteMember\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/deleteMember\">회원탈퇴 <i class=\"fas fa-seedling\"></i></a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-12 d-flex justify-content-end pe-3 py-1 mb-2\">\n");
      out.write("						<button class=\"p-1 px-3 btn border-0 modifyComplete\">수정완료</button>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<!-- 프로필 수정하기 폼 End -->\n");
      out.write("    <!-- 끝 -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/friend.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("//사용자와 프로필 소유자의 이메일을 가져오기\n");
      out.write("var currentUser = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileEmail.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\n");
      out.write("var profileOwner = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("// 이메일이 일치하지 않으면 프로필 편집 버튼을 숨기기 \n");
      out.write("if(currentUser !== profileOwner){\n");
      out.write("	var editButton = document.getElementById(\"profileModify\");\n");
      out.write("	editButton.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("if(currentUser == profileOwner){\n");
      out.write("	var messageBtn = document.getElementById(\"messageSend\");\n");
      out.write("	var fallowBtn = document.getElementById(\"fallow\");\n");
      out.write("	messageBtn.style.display =\"none\";\n");
      out.write("	fallowBtn.style.display =\"none\";\n");
      out.write("}\n");
      out.write("$(function() {\n");
      out.write("\n");
      out.write("	$(\".profileTab-club\").on(\"click\", function() {\n");
      out.write("		console.log(\"모임리스트 출력하기~\")\n");
      out.write("		$(\".profile-board\").empty()\n");
      out.write("		$(\".profileTab-club\").addClass(\"border-3\")\n");
      out.write("		$(\".profileTab-board\").removeClass(\"border-3\")\n");
      out.write("		$(\".profileTab-tag\").removeClass(\"border-3\")\n");
      out.write("		if('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty member}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'){\n");
      out.write("			clubService.getMyClubList({email: encodeURIComponent('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')}, function(result){\n");
      out.write("				for(let i in result){\n");
      out.write("					console.log(result[i])\n");
      out.write("					console.log(result[i].cname)\n");
      out.write("				}\n");
      out.write("			})\n");
      out.write("		}\n");
      out.write("	})\n");
      out.write("	\n");
      out.write("	$(\".message-btn\").on(\"click\", function() {\n");
      out.write("		messageService.chat({}, function(result) {\n");
      out.write("			\n");
      out.write("		})\n");
      out.write("	})\n");
      out.write("\n");
      out.write("	/*-------------------------- 태그 탭 -------------------------- */\n");
      out.write("	$(\".profileTab-tag\").click(function () {\n");
      out.write("		$(\".profile-board\").empty()\n");
      out.write("		$(\".profileTab-tag\").addClass(\"border-3\")\n");
      out.write("		$(\".profileTab-board\").removeClass(\"border-3\")\n");
      out.write("		$(\".profileTab-club\").removeClass(\"border-3\")\n");
      out.write("	})\n");
      out.write("\n");
      out.write("	/*-------------------------- 글 목록 탭 -------------------------- */\n");
      out.write("\n");
      out.write("	boardService.getList({id : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileEmail.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'}, function (result) {\n");
      out.write("		let str = \"\";\n");
      out.write("		for (let i in result) {\n");
      out.write("			str += getMyFeedStr(result[i])\n");
      out.write("		}\n");
      out.write("		$(\".profile-board\").html(str)\n");
      out.write("	})\n");
      out.write("\n");
      out.write("	boardService.getAllList({email : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileEmail.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'}, function (result) {\n");
      out.write("		$(\".boardCnt\").html(result.length)\n");
      out.write("	})\n");
      out.write("\n");
      out.write("	$(\".profileTab-board\").click(function () {\n");
      out.write("		$(\".profile-board\").empty()\n");
      out.write("		$(\".profileTab-board\").addClass(\"border-3\")\n");
      out.write("		$(\".profileTab-tag\").removeClass(\"border-3\")\n");
      out.write("		$(\".profileTab-club\").removeClass(\"border-3\")\n");
      out.write("		boardService.getList({id : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'}, function (result) {\n");
      out.write("			let str = \"\";\n");
      out.write("			for (let i in result) {\n");
      out.write("				str += getMyFeedStr(result[i])\n");
      out.write("			}\n");
      out.write("			$(\".profile-board\").html(str)\n");
      out.write("		})\n");
      out.write("	})\n");
      out.write("\n");
      out.write("	$(\".profile-board\").on(\"click\", \".profileBoard\", function () {\n");
      out.write("		let src = $(this).data(\"src\");\n");
      out.write("		let rno = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reply.rno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\n");
      out.write("		console.log(src)\n");
      out.write("\n");
      out.write("		boardService.get($(this).data(\"bno\"), function (result) {\n");
      out.write("			$(\"#boardModal\").modal(\"show\").data(\"bno\", result.bno)\n");
      out.write("			$(\"#detailImage\").attr(\"src\", src)\n");
      out.write("			$(\"#writer\").text(result.writer)\n");
      out.write("			$(\"#content\").text(result.content)\n");
      out.write("			$(\"#regdate\").text(moment(result.regdate).startOf('day').fromNow())\n");
      out.write("			$(\"#modalFooter button\").show()\n");
      out.write("			$(\"#modalFooter button\").eq(2).hide()\n");
      out.write("			$(\"#boardModal\").modal(\"show\").data(\"bno\", result.bno)\n");
      out.write("\n");
      out.write("			replyService.getList({bno:$(\"#boardModal\").modal(\"show\").data(\"bno\"), rno:rno}, function(result) {\n");
      out.write("				var str = \"\";\n");
      out.write("				for(var i in result) {\n");
      out.write("					str += getReplyLiStr(result[i]);\n");
      out.write("				}\n");
      out.write("				$(\".chat\").html(str);\n");
      out.write("			})\n");
      out.write("		})\n");
      out.write("	})\n");
      out.write("\n");
      out.write("	// 내 글 목록 조회\n");
      out.write("	function getMyFeedStr(obj) {\n");
      out.write("		return `\n");
      out.write("		<div class=\"col-4 overflow-hidden profileBoard\" data-bno=\"${obj.bno}\" data-src=\"/display?name=${obj.attaches[0]['name']}&path=${obj.attaches[0]['path']}&uuid=${obj.attaches[0]['uuid']}&image=${obj.attaches[0]['image']}&thumb=on\">\n");
      out.write("			<a>\n");
      out.write("				<img class=\"p-1\" src=\"/display?name=${obj.attaches[0]['name']}&path=${obj.attaches[0]['path']}&uuid=${obj.attaches[0]['uuid']}&image=${obj.attaches[0]['image']}&thumb=on\">\n");
      out.write("			</a>\n");
      out.write("		</div>\n");
      out.write("	`\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	// 댓글 리스트 조회\n");
      out.write("	function getReplyLiStr(obj) {\n");
      out.write("		return `<li class=\"list-group-item\" style=\"border-bottom: 0\" data-rno=\"${obj.rno}\">\n");
      out.write("			   		<div class=\"header\">\n");
      out.write("						<strong class=\"primary-font\" data-writer=\"${obj.writer}\">${obj.writer}</strong>\n");
      out.write("						<small class=\"float-right text-muted\">${moment(obj.regdate).fromNow()}</small>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"d-flex\">\n");
      out.write("					<div class=\"col-9\">\n");
      out.write("					<span class=\"reply-content\" data-content=\"${obj.content}\">${obj.content}</span>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"dropdown col-2 float-left\">\n");
      out.write("					  <a class=\"btn\" data-toggle=\"dropdown\">\n");
      out.write("						<i class=\"fas fa-ellipsis-h dropicon\"></i>\n");
      out.write("					  </a>\n");
      out.write("					  <div class=\"dropdown-menu\">\n");
      out.write("					    <a class=\"dropdown-item\">답글 달기</a>\n");
      out.write("					    <a class=\"dropdown-item\" id=\"replymodify\">수정</a>\n");
      out.write("					    <a class=\"dropdown-item text-danger\" id=\"replydelete\">삭제</a>\n");
      out.write("					  </div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-2\">\n");
      out.write("					<a><i class=\"far fa-heart\" id=\"heart\"></i></a></div></div>\n");
      out.write("					</li>`;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	/* 프로핊 편집 클릭 -> 모달 메서드*/\n");
      out.write("	$(\"#profileModify\").on(\"click\", function() {\n");
      out.write("		$(\"#profileModifyModal\").modal(\"show\")\n");
      out.write("		var val = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("		console.log(val);\n");
      out.write("		$('.modifyComplete').on(\"click\", function(){\n");
      out.write("			event.preventDefault();\n");
      out.write("			var x = {\n");
      out.write("					intro : $(\".memberIntro\").val(),\n");
      out.write("					id : $(\"#idModify\").val(),\n");
      out.write("					name : $(\"#nameModify\").val(),\n");
      out.write("					email : val\n");
      out.write("				  };\n");
      out.write("			console.log(x);\n");
      out.write("			memberservice.update(x,function(result){\n");
      out.write("					alert(\"정보수정이 완료되었습니다\")\n");
      out.write("				  $(\"#profileModifyModal\").modal(\"hide\")\n");
      out.write("				    location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/profile/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/damso\"  \n");
      out.write("			})\n");
      out.write("		})\n");
      out.write("	})\n");
      out.write("	\n");
      out.write("\n");
      out.write("	\n");
      out.write("\n");
      out.write("})\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/footer.jsp", out, false);
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
