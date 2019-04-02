package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import data.FileDAO;
import data.DatabaseDAO;
import java.util.ArrayList;
import model.Course;
import controller.AdminController;

public final class membermain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Study Online</title>\n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/header.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/header.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/stream.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/stream.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/course.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/course.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/footer.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/footer.css\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.2.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#see_more').click(function () {\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: 'POST',\n");
      out.write("                        url: 'CourseController',\n");
      out.write("                        data: {\n");
      out.write("                            page: $('#pages').val()\n");
      out.write("                        },\n");
      out.write("                        success: function (result) {\n");
      out.write("                            $('#resultMoreCourse').html(result);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                    var value = parseInt($('#pages').val()) + 5;\n");
      out.write("                    $('#pages').val(value.toString());\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Header-->\n");
      out.write("        <div class=\"headers\">   \n");
      out.write("            <ul class=\"headers_nav\">\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"home_button\">\n");
      out.write("                        <a href=\"index.jsp\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"categories\">\n");
      out.write("                        <img src=\"images/categories-512.png\" alt=\"\">\n");
      out.write("                        <div class=\"categories_text\">Categories</div>\n");
      out.write("                        <div class=\"categories_contents\">\n");
      out.write("                            <a href=\"#\">IT and Software</a>\n");
      out.write("                            <a href=\"#\">Design</a>\n");
      out.write("                            <a href=\"#\">Development</a>\n");
      out.write("                            <a href=\"#\">Business</a>\n");
      out.write("                            <a href=\"#\">Photography</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"searchbox_h\">\n");
      out.write("                        <input type=\"text\" name=\"searchbox_h\" class=\"seachboxInput\">\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"li_signup\">\n");
      out.write("                    <form method=\"POST\" action=\"MemberController\">\n");
      out.write("                        <input type=\"hidden\" value=\"main\" name=\"action\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${membername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\">\n");
      out.write("                        <button id=\"\" type=\"submit\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${membername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</button>\n");
      out.write("                    </form>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Stream-->\n");
      out.write("        <div class=\"stream\">\n");
      out.write("            <img id=\"image\" src=\"images/learning2.png\">\n");
      out.write("        </div>\n");
      out.write("        <!--Courses-->\n");
      out.write("        ");

            DatabaseDAO database = new DatabaseDAO();
            int maxResult = 5;
            ArrayList<Course> list = database.getList(0, maxResult);
        
      out.write("\n");
      out.write("        <div class=\"courses\">\n");
      out.write("            <div class=\"member_course it_courses\">\n");
      out.write("                <div class=\"title\" id=\"it_title\">\n");
      out.write("                    <p><b>Top Courses in \"IT and Software\"</b></p>\n");
      out.write("                </div>\n");
      out.write("                <section class=\"list_courses\">\n");
      out.write("                    ");

                        for (Course c : list) {
                    
      out.write("\n");
      out.write("                    <a href=\"#\" class=\"flex_course\">\n");
      out.write("                        <section class=\"course course1\">\n");
      out.write("                            <img id=\"image_course\" src=\"");
      out.print(c.getImage());
      out.write("\">\n");
      out.write("                            <p><b>");
      out.print(c.getCourseName());
      out.write("</b></p>\n");
      out.write("                            <p class=\"author\">");
      out.print(c.getAuthor());
      out.write("</p>\n");
      out.write("                            <p> &#9733 &#9733 &#9733 &#9733 &#9733</p>\n");
      out.write("                        </section>\n");
      out.write("                    </a>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <form class=\"see_more\" method=\"post\">\n");
      out.write("                    <input class=\"see_morebtn\" type=\"submit\" value=\"See More\" >\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"member_course development_courses\">\n");
      out.write("                <div class=\"title\" id=\"development_title\">\n");
      out.write("                    <p><b>Top Courses in \"Development\"</b></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"list_courses\" id=\"developmentCourse\">\n");
      out.write("                    ");

                        for (Course c : list) {
                    
      out.write("\n");
      out.write("                    <a class=\"flex_course\" href=\"#\">\n");
      out.write("                        <section class=\"course course1\">\n");
      out.write("                            <img src=\"");
      out.print(c.getImage());
      out.write("\">\n");
      out.write("                            <p><b>");
      out.print(c.getCourseName());
      out.write("</b></p>\n");
      out.write("                            <p class=\"author\">");
      out.print(c.getAuthor());
      out.write("</p>\n");
      out.write("                            <p> &#9733 &#9733 &#9733 &#9733 &#9733</p>\n");
      out.write("                        </section>\n");
      out.write("                    </a>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <div id=\"resultMoreCourse\"></div>\n");
      out.write("                </div>\n");
      out.write("                <form class=\"see_more\">\n");
      out.write("                    <input class=\"see_morebtn\" type=\"button\" value=\"See More\" id=\"see_more\">\n");
      out.write("                    <input type=\"hidden\" value=\"0\" id=\"pages\" >\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"aboutus\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><img src=\"images/home1.png\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">About Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Copyright &copy 2017</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Terms</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Privacy Policy and Cookie Policy</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <ul id=\"ul_footer\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"flag\" src=\"images/spain.png\">\n");
      out.write("                        <p class=\"nation\">Spain</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"flag\" src=\"images/french.png\">\n");
      out.write("                        <p class=\"nation\">French</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"flag\" src=\"images/germany.png\">\n");
      out.write("                        <p class=\"nation\">Germany</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img class=\"flag\" src=\"images/netherlands.png\">\n");
      out.write("                        <p class=\"nation\">Netherlands</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img id=\"icon_language\" src=\"images/language.png\">\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--JavaScript-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/header.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/course.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/footer.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
