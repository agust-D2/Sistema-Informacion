package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <form action=\"select.php\" method=\"post\"> \n");
      out.write("      <input type=\"text\" name=\"user\" placeholder=\"enter a text\" /> \n");
      out.write("      <input type=\"submit\" value=\"submit\" onclick=\"test()\" /> \n");
      out.write("    </form>\n");
      out.write("  <input type=\"file\" id=\"file-input\" />\n");
      out.write("<h3>Contenido del archivo:</h3>\n");
      out.write("<pre id=\"contenido-archivo\"></pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language=javascript>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    var contador = 0;        \n");
      out.write("  function leerArchivo(e) {\n");
      out.write("  var archivo = e.target.files[0];\n");
      out.write("  if (!archivo) {\n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("  var lector = new FileReader();\n");
      out.write("  lector.onload = function(e) {\n");
      out.write("    var contenido = e.target.result;\n");
      out.write("    var lineas = contenido.split('\\n');\n");
      out.write("    \n");
      out.write("    for (var i=0; i < lineas.length; i++) {\n");
      out.write("        if( contador === 0){\n");
      out.write("            var num_medidor=lineas[i];\n");
      out.write("            document.write(num_medidor);\n");
      out.write("            contador++; \n");
      out.write("        }\n");
      out.write("        else if( contador === 1){\n");
      out.write("            var marca=lineas[i];;\n");
      out.write("            document.write(marca);\n");
      out.write("            contador++;\n");
      out.write("        }\n");
      out.write("        else if( contador === 2){\n");
      out.write("            var tipo_medidor=lineas[i];;\n");
      out.write("            document.write(tipo_medidor);\n");
      out.write("            contador++;\n");
      out.write("        }\n");
      out.write("        else if( contador === 3){\n");
      out.write("            var estado_medidor=lineas[i];;\n");
      out.write("            document.write(estado_medidor);\n");
      out.write("            contador++;\n");
      out.write("        }\n");
      out.write("        else if( contador === 4){\n");
      out.write("            var diametro=lineas[i];;\n");
      out.write("            document.write(diametro);\n");
      out.write("            contador++;\n");
      out.write("        }\n");
      out.write("        else if( contador === 5){\n");
      out.write("            var clase_metro=lineas[i];;\n");
      out.write("            document.write(clase_metro);\n");
      out.write("            contador++;\n");
      out.write("        }\n");
      out.write("        else if( contador === 6){\n");
      out.write("            var material_medidor=lineas[i];;\n");
      out.write("            document.write(material_medidor + \"<br>\");\n");
      out.write("            contador=0;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    mostrarContenido(lineas);\n");
      out.write("    \n");
      out.write("  };\n");
      out.write("  lector.readAsText(archivo);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function mostrarContenido(contenido) {\n");
      out.write("  var elemento = document.getElementById('contenido-archivo');\n");
      out.write("  elemento.innerHTML = contenido;\n");
      out.write("}\n");
      out.write("\n");
      out.write("document.getElementById('file-input')\n");
      out.write("  .addEventListener('change', leerArchivo, false);\n");
      out.write("  </script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
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
