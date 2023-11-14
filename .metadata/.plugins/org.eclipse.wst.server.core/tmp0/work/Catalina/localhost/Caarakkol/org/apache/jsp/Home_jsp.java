/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.81
 * Generated at: 2023-11-12 22:25:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"home.css\" />\r\n");
      out.write("<title>Catalogo Carros</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <p class=\"brand\">\r\n");
      out.write("                    Max<strong>Auto</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#catalog\">CatÃ¡logo</a></li>\r\n");
      out.write("                    <li><a href=\"#about\">Sobre</a></li>\r\n");
      out.write("                    <li><a href=\"#features\">CaracterÃ­sticas</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <button onclick=\"sair()\">Sair</button>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"header-block\">\r\n");
      out.write("                <div class=\"text\">\r\n");
      out.write("                    <h2>O carro perfeito pra vocÃª</h2>\r\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("                        Pellentesque viverra elit sit amet mattis viverra. Fusce et lectus\r\n");
      out.write("                        tortor. Praesent sed purus mollis, pellentesque lectus in, pretium\r\n");
      out.write("                        ante. Nunc viverra ornare dolor. Duis felis felis, sodales quis\r\n");
      out.write("                        erat at, posuere efficitur eros. Suspendisse potenti.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <img src=\"../imagens/car-header.png\" alt=\"Car\" />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <section class=\"catalog\" id=\"catalog\">\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"title-wrapper-catalog\">\r\n");
      out.write("                <p>Encontre o que deseja!</p>\r\n");
      out.write("                <h3>CatÃ¡logo</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"filter-card\">\r\n");
      out.write("                <input type=\"text\" id=\"search-input\" name=\"search-input\" placeholder=\"Escolha seu modelo favorito\"/>\r\n");
      out.write("                <button onclick=\"search()\">Buscar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-wrapper\">\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car1.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>Audi Supra TT</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 300.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 50.000 KM, AutomÃ¡tico, Vermelho, Gasolina</p>\r\n");
      out.write("                        <a href=\"Audi.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car2.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>BMW i8</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 1.000.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 2.000 KM, AutomÃ¡tico, Vermelho, Gasolina e ElÃ©trico</p>\r\n");
      out.write("                        <a href=\"BMW-i8.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car3.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>Ferrari 488 GTB</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 3.000.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 11.000 KM, AutomÃ¡tico, Vermelho, Gasolina</p>\r\n");
      out.write("                        <a href=\"Ferrari.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car1.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>Audi Supra TT</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 300.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 50.000 KM, AutomÃ¡tico, Vermelho, Gasolina</p>\r\n");
      out.write("                        <a href=\"Audi.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car2.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>BMW i8</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 1.000.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 2.000 KM, AutomÃ¡tico, Vermelho, Gasolina e ElÃ©trico</p>\r\n");
      out.write("                        <a href=\"BMW-i8.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car3.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>Ferrari 488 GTB</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 3.000.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 11.000 KM, AutomÃ¡tico, Vermelho, Gasolina</p>\r\n");
      out.write("                        <a href=\"Ferrari.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car1.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>Audi Supra TT</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 300.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 50.000 KM, AutomÃ¡tico, Vermelho, Gasolina</p>\r\n");
      out.write("                        <a href=\"Audi.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car2.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>BMW i8</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 1.000.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 2.000 KM, AutomÃ¡tico, Vermelho, Gasolina e ElÃ©trico</p>\r\n");
      out.write("                        <a href=\"BMW-i8.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-item\">\r\n");
      out.write("                    <img src=\"./imagens/car3.png\" alt=\"Car\" />\r\n");
      out.write("                    <div class=\"card-content\">\r\n");
      out.write("                        <h3>Ferrari 488 GTB</h3>\r\n");
      out.write("                        <p>Ano: 2023</p>\r\n");
      out.write("                        <p>PreÃ§o: R$ 3.000.000</p>\r\n");
      out.write("                        <p>DescriÃ§Ã£o: 11.000 KM, AutomÃ¡tico, Vermelho, Gasolina</p>\r\n");
      out.write("                        <a href=\"Ferrari.jsp\">Ver DescriÃ§Ã£o</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"about\" id=\"about\">\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"title-wrapper-about\">\r\n");
      out.write("                <p>Nos conheÃ§a aqui</p>\r\n");
      out.write("                <h3>Sobre</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"about-content\">\r\n");
      out.write("                <div class=\"left\">\r\n");
      out.write("                    <img src=\"./imagens/about.png\" alt=\"About\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right\">\r\n");
      out.write("                    <h3>Join technology and mobility</h3>\r\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.\r\n");
      out.write("                        Repudiandae ut inventore magni repellendus ab ad itaque facere. A\r\n");
      out.write("                        tenetur quam, nobis tempore illum laborum ipsa fuga, itaque\r\n");
      out.write("                        possimus repellat ad perspiciatis, velit reiciendis eos facilis\r\n");
      out.write("                        sapiente blanditiis quas officia hic beatae quibusdam! Quod\r\n");
      out.write("                        eligendi porro possimus voluptatum ad ipsum sapiente soluta,\r\n");
      out.write("                        maiores nobis tenetur adipisci officiis nisi illum quae natus\r\n");
      out.write("                        nostrum tempora accusantium blanditiis? Rem nesciunt illum\r\n");
      out.write("                        dolorum, perferendis quos consequatur suscipit cumque fugiat alias\r\n");
      out.write("                        sint repellat qui adipisci error est distinctio doloribus labore\r\n");
      out.write("                        sunt modi eos odio quibusdam dicta. Dignissimos voluptate illum\r\n");
      out.write("                        possimus quo. Ducimus repellat doloribus quisquam quidem?</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"features\" id=\"features\">\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"title-wrapper-features\">\r\n");
      out.write("                <p>Nossas qualidades</p>\r\n");
      out.write("                <h3>CaracterÃ­sticas</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"feature-card-block\">\r\n");
      out.write("                <div class=\"feature-card-item\">\r\n");
      out.write("                    <img src=\"./imagens/feature-planet.png\" alt=\"Feature\" />\r\n");
      out.write("                    <div class=\"feature-text-content\">\r\n");
      out.write("                        <h3>Title</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature-card-item\">\r\n");
      out.write("                    <img src=\"./imagens/feature-planet.png\" alt=\"Feature\" />\r\n");
      out.write("                    <div class=\"feature-text-content\">\r\n");
      out.write("                        <h3>Title</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature-card-item\">\r\n");
      out.write("                    <img src=\"./imagens/feature-planet.png\" alt=\"Feature\" />\r\n");
      out.write("                    <div class=\"feature-text-content\">\r\n");
      out.write("                        <h3>Title</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature-card-item\">\r\n");
      out.write("                    <img src=\"./imagens/feature-planet.png\" alt=\"Feature\" />\r\n");
      out.write("                    <div class=\"feature-text-content\">\r\n");
      out.write("                        <h3>Title</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature-card-item\">\r\n");
      out.write("                    <img src=\"./imagens/feature-planet.png\" alt=\"Feature\" />\r\n");
      out.write("                    <div class=\"feature-text-content\">\r\n");
      out.write("                        <h3>Title</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"feature-card-item\">\r\n");
      out.write("                    <img src=\"./imagens/feature-planet.png\" alt=\"Feature\" />\r\n");
      out.write("                    <div class=\"feature-text-content\">\r\n");
      out.write("                        <h3>Title</h3>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"content footer-links\">\r\n");
      out.write("                <div class=\"footer-company\">\r\n");
      out.write("                    <h4>Empresa</h4>\r\n");
      out.write("                    <h6>Sobre</h6>\r\n");
      out.write("                    <h6>Coontato</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-rental\">\r\n");
      out.write("                    <h4>Locadora</h4>\r\n");
      out.write("                    <h6>ConduÃ§Ã£o AutomÃ¡tica</h6>\r\n");
      out.write("                    <h6>ConduÃ§Ã£o Manual</h6>\r\n");
      out.write("                    <h6>Ajuda</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-social\">\r\n");
      out.write("                    <h4>Conecte-se conosco!</h4>\r\n");
      out.write("                    <div class=\"social-icons\">\r\n");
      out.write("                        <img src=\"./imagens/instagram.png\" alt=\"Instagram\" /> <img src=\"./imagens/facebook.png\"\r\n");
      out.write("                            alt=\"Facebook\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-contact\">\r\n");
      out.write("                    <h4>Contate conosco!</h4>\r\n");
      out.write("                    <h6>+55 85 911223344</h6>\r\n");
      out.write("                    <h6>maxautos@contato.com.br</h6>\r\n");
      out.write("                    <h6>Nome da Rua, Fortaleza - CE</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"last\">Â© MaxAutos 2023 - Todos os direitos reservados</div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"home.js\"></script>\r\n");
      out.write(">>>>>>> d5507699ef30c31fa8634038b99524d06f443749\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
