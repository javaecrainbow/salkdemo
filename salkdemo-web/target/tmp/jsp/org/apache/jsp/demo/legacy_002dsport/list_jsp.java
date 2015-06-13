package org.apache.jsp.demo.legacy_002dsport;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("    <title>legacy-sport</title>\n");
      out.write("    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport' />\n");
      out.write("    \n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src='assets/javascripts/html5shiv.js' type='text/javascript'></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <link href='assets/stylesheets/bootstrap/bootstrap.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <link href='assets/stylesheets/bootstrap/bootstrap-responsive.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / jquery ui -->\n");
      out.write("    <link href='assets/stylesheets/jquery_ui/jquery-ui-1.10.0.custom.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <link href='assets/stylesheets/jquery_ui/jquery.ui.1.10.0.ie.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / switch buttons -->\n");
      out.write("    <link href='assets/stylesheets/plugins/bootstrap_switch/bootstrap-switch.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / xeditable -->\n");
      out.write("    <link href='assets/stylesheets/plugins/xeditable/bootstrap-editable.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <link href='assets/stylesheets/plugins/common/bootstrap-wysihtml5.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / wysihtml5 (wysywig) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/common/bootstrap-wysihtml5.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / jquery file upload -->\n");
      out.write("    <link href='assets/stylesheets/plugins/jquery_fileupload/jquery.fileupload-ui.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / full calendar -->\n");
      out.write("    <link href='assets/stylesheets/plugins/fullcalendar/fullcalendar.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / select2 -->\n");
      out.write("    <link href='assets/stylesheets/plugins/select2/select2.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / mention -->\n");
      out.write("    <link href='assets/stylesheets/plugins/mention/mention.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / tabdrop (responsive tabs) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/tabdrop/tabdrop.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / jgrowl notifications -->\n");
      out.write("    <link href='assets/stylesheets/plugins/jgrowl/jquery.jgrowl.min.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / datatables -->\n");
      out.write("    <link href='assets/stylesheets/plugins/datatables/bootstrap-datatable.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / dynatrees (file trees) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/dynatree/ui.dynatree.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / color picker -->\n");
      out.write("    <link href='assets/stylesheets/plugins/bootstrap_colorpicker/bootstrap-colorpicker.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / datetime picker -->\n");
      out.write("    <link href='assets/stylesheets/plugins/bootstrap_datetimepicker/bootstrap-datetimepicker.min.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / daterange picker) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/bootstrap_daterangepicker/bootstrap-daterangepicker.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / flags (country flags) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/flags/flags.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / slider nav (address book) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/slider_nav/slidernav.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / fuelux (wizard) -->\n");
      out.write("    <link href='assets/stylesheets/plugins/fuelux/wizard.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / flatty theme -->\n");
      out.write("    <link href='assets/stylesheets/light-theme.css' id='color-settings-body-color' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- / demo -->\n");
      out.write("    <link href='assets/stylesheets/demo.css' media='all' rel='stylesheet' type='text/css' />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class='contrast-red '>\n");
      out.write("<header>\n");
      out.write("    <div class='navbar'>\n");
      out.write("        <div class='navbar-inner'>\n");
      out.write("            <div class='container-fluid'>\n");
      out.write("                <a class='brand' href='index.html'>\n");
      out.write("                    <i class='icon-heart-empty'></i>\n");
      out.write("                    <span class='hidden-phone'>誠品球衣管理系統</span>\n");
      out.write("                </a>\n");
      out.write("                <a class='toggle-nav btn pull-left' href='#'>\n");
      out.write("                    <i class='icon-reorder'></i>\n");
      out.write("                </a>\n");
      out.write("                <ul class='nav pull-right'>\n");
      out.write("                    <li class='dropdown light only-icon'>\n");
      out.write("                        <a class='dropdown-toggle' data-toggle='dropdown' href='#'>\n");
      out.write("                            <i class='icon-adjust'></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class='dropdown-menu color-settings'>\n");
      out.write("                            <li class='color-settings-body-color'>\n");
      out.write("                                <div class='color-title'>Body color</div>\n");
      out.write("                                <a data-change-to='assets/stylesheets/light-theme.css' href='#'>\n");
      out.write("                                    Light\n");
      out.write("                                    <small>(default)</small>\n");
      out.write("                                </a>\n");
      out.write("                                <a data-change-to='assets/stylesheets/dark-theme.css' href='#'>\n");
      out.write("                                    Dark\n");
      out.write("                                </a>\n");
      out.write("                                <a data-change-to='assets/stylesheets/dark-blue-theme.css' href='#'>\n");
      out.write("                                    Dark blue\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='divider'></li>\n");
      out.write("                            <li class='color-settings-contrast-color'>\n");
      out.write("                                <div class='color-title'>Contrast color</div>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-red\"><i class='icon-adjust text-red'></i>\n");
      out.write("                                    Red\n");
      out.write("                                    <small>(default)</small>\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-blue\"><i class='icon-adjust text-blue'></i>\n");
      out.write("                                    Blue\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-orange\"><i class='icon-adjust text-orange'></i>\n");
      out.write("                                    Orange\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-purple\"><i class='icon-adjust text-purple'></i>\n");
      out.write("                                    Purple\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-green\"><i class='icon-adjust text-green'></i>\n");
      out.write("                                    Green\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-muted\"><i class='icon-adjust text-muted'></i>\n");
      out.write("                                    Muted\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-fb\"><i class='icon-adjust text-fb'></i>\n");
      out.write("                                    Facebook\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-dark\"><i class='icon-adjust text-dark'></i>\n");
      out.write("                                    Dark\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-pink\"><i class='icon-adjust text-pink'></i>\n");
      out.write("                                    Pink\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-grass-green\"><i class='icon-adjust text-grass-green'></i>\n");
      out.write("                                    Grass green\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-sea-blue\"><i class='icon-adjust text-sea-blue'></i>\n");
      out.write("                                    Sea blue\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-banana\"><i class='icon-adjust text-banana'></i>\n");
      out.write("                                    Banana\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-dark-orange\"><i class='icon-adjust text-dark-orange'></i>\n");
      out.write("                                    Dark orange\n");
      out.write("                                </a>\n");
      out.write("                                <a href=\"#\" data-change-to=\"contrast-brown\"><i class='icon-adjust text-brown'></i>\n");
      out.write("                                    Brown\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class='dropdown medium only-icon widget'>\n");
      out.write("                        <a class='dropdown-toggle' data-toggle='dropdown' href='#'>\n");
      out.write("                            <i class='icon-rss'></i>\n");
      out.write("                            <div class='label'>5</div>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class='dropdown-menu'>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='#'>\n");
      out.write("                                    <div class='widget-body'>\n");
      out.write("                                        <div class='pull-left icon'>\n");
      out.write("                                            <i class='icon-user text-success'></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='pull-left text'>\n");
      out.write("                                            John Doe signed up\n");
      out.write("                                            <small class='muted'>just now</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='divider'></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='#'>\n");
      out.write("                                    <div class='widget-body'>\n");
      out.write("                                        <div class='pull-left icon'>\n");
      out.write("                                            <i class='icon-inbox text-error'></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='pull-left text'>\n");
      out.write("                                            New Order #002\n");
      out.write("                                            <small class='muted'>3 minutes ago</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='divider'></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='#'>\n");
      out.write("                                    <div class='widget-body'>\n");
      out.write("                                        <div class='pull-left icon'>\n");
      out.write("                                            <i class='icon-comment text-warning'></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='pull-left text'>\n");
      out.write("                                            America Leannon commented Flatty with veeery long text.\n");
      out.write("                                            <small class='muted'>1 hour ago</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='divider'></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='#'>\n");
      out.write("                                    <div class='widget-body'>\n");
      out.write("                                        <div class='pull-left icon'>\n");
      out.write("                                            <i class='icon-user text-success'></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='pull-left text'>\n");
      out.write("                                            Jane Doe signed up\n");
      out.write("                                            <small class='muted'>last week</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='divider'></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='#'>\n");
      out.write("                                    <div class='widget-body'>\n");
      out.write("                                        <div class='pull-left icon'>\n");
      out.write("                                            <i class='icon-inbox text-error'></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class='pull-left text'>\n");
      out.write("                                            New Order #001\n");
      out.write("                                            <small class='muted'>1 year ago</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='widget-footer'>\n");
      out.write("                                <a href='#'>All notifications</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class='dropdown dark user-menu'>\n");
      out.write("                        <a class='dropdown-toggle' data-toggle='dropdown' href='#'>\n");
      out.write("                            <img alt='Mila Kunis' height='23' src='assets/images/avatar.jpg' width='23' />\n");
      out.write("                            <span class='user-name hidden-phone'>Mila Kunis</span>\n");
      out.write("                            <b class='caret'></b>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class='dropdown-menu'>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='user_profile.html'>\n");
      out.write("                                    <i class='icon-user'></i>\n");
      out.write("                                    Profile\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='user_profile.html'>\n");
      out.write("                                    <i class='icon-cog'></i>\n");
      out.write("                                    Settings\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class='divider'></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href='sign_in.html'>\n");
      out.write("                                    <i class='icon-signout'></i>\n");
      out.write("                                    Sign out\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form accept-charset=\"UTF-8\" action=\"search_results.html\" class=\"navbar-search pull-right hidden-phone\" method=\"get\" /><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /></div>\n");
      out.write("                    <button class=\"btn btn-link icon-search\" name=\"button\" type=\"submit\"></button>\n");
      out.write("                    <input autocomplete=\"off\" class=\"search-query span2\" id=\"q_header\" name=\"q\" placeholder=\"Search...\" type=\"text\" value=\"\" />\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<div id='wrapper'>\n");
      out.write("<div id='main-nav-bg'></div>\n");
      out.write("<nav class='' id='main-nav'>\n");
      out.write("<div class='navigation'>\n");
      out.write("<div class='search'>\n");
      out.write("    <form accept-charset=\"UTF-8\" action=\"search_results.html\" method=\"get\" /><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /></div>\n");
      out.write("        <div class='search-wrapper'>\n");
      out.write("            <input autocomplete=\"off\" class=\"search-query\" id=\"q\" name=\"q\" placeholder=\"Search...\" type=\"text\" value=\"\" />\n");
      out.write("            <button class=\"btn btn-link icon-search\" name=\"button\" type=\"submit\"></button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<ul class='nav nav-stacked'>\n");
      out.write("<li class=''>\n");
      out.write("    <a href='index.html'>\n");
      out.write("        <i class='icon-dashboard'></i>\n");
      out.write("        <span>首頁</span>\n");
      out.write("    </a>\n");
      out.write("</li>\n");
      out.write("<li class='active'>\n");
      out.write("    <a class='dropdown-collapse' href='#'>\n");
      out.write("        <i class='icon-edit'></i>\n");
      out.write("        <span>仓库管理</span>\n");
      out.write("        <i class='icon-angle-down angle-down'></i>\n");
      out.write("    </a>\n");
      out.write("    <ul class='in nav nav-stacked'>\n");
      out.write("        <li class=''>\n");
      out.write("            <a href='input.jsp'>\n");
      out.write("                <i class='icon-caret-right'></i>\n");
      out.write("                <span>新增出貨記錄</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class='active'>\n");
      out.write("            <a href='/demo/legacy-sport/list.html'>\n");
      out.write("                <i class='icon-caret-right'></i>\n");
      out.write("                <span>出貨記錄查詢</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("</li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("<section id='content'>\n");
      out.write("<div class='container-fluid'>\n");
      out.write("<div class='row-fluid' id='content-wrapper'>\n");
      out.write("<div class='span12'>\n");
      out.write("<div class='row-fluid'>\n");
      out.write("    <div class='span12'>\n");
      out.write("        <div class='page-header'>\n");
      out.write("            <h1 class='pull-left'>\n");
      out.write("                <i class='icon-table'></i>\n");
      out.write("                <span>出貨記錄查詢</span>\n");
      out.write("            </h1>\n");
      out.write("            <div class='pull-right'>\n");
      out.write("                <ul class='breadcrumb'>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index.html\"><i class='icon-bar-chart'></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class='separator'>\n");
      out.write("                        <i class='icon-angle-right'></i>\n");
      out.write("                    </li>\n");
      out.write("                    <li class='active'>出貨記錄查詢</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class='row-fluid'>\n");
      out.write("<div class='span12 box bordered-box orange-border' style='margin-bottom:0;'>\n");
      out.write("<div class='box-header orange-background'>\n");
      out.write("    <div class='title'>出貨記錄查詢</div>\n");
      out.write("    <div class='actions'>\n");
      out.write("        <a href=\"#\" class=\"btn box-remove btn-mini btn-link\"><i class='icon-remove'></i>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"#\" class=\"btn box-collapse btn-mini btn-link\"><i></i>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class='box-content box-no-padding'>\n");
      out.write("<div class='responsive-table'>\n");
      out.write("<div class='scrollable-area'>\n");
      out.write("<table class='data-table table table-bordered table-striped' style='margin-bottom:0;'>\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("    <th>\n");
      out.write("        出貨單號\n");
      out.write("    </th>\n");
      out.write("    <th>\n");
      out.write("       產品種類\n");
      out.write("    </th>\n");
      out.write("    <th>\n");
      out.write("        出貨日期\n");
      out.write("    </th>\n");
      out.write("    <th>\n");
      out.write("       出貨顏色\n");
      out.write("    </th>\n");
      out.write("     <th>\n");
      out.write("        出貨尺碼\n");
      out.write("    </th>\n");
      out.write("    \n");
      out.write("    <th>操作</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_8(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_9(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_12(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_13(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_16(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_17(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_18(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_19(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_20(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_21(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_22(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_23(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_24(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_25(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_26(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_27(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_28(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_29(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_30(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_31(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_32(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_33(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_34(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_35(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_36(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_37(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_38(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_39(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_40(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_41(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_42(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_43(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("\t<tr>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_44(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>");
      if (_jspx_meth_c_out_45(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("    <td>\n");
      out.write("       2015-08-25\n");
      out.write("        \n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        ");
      if (_jspx_meth_c_out_46(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("      <td>\n");
      out.write("\t");
      if (_jspx_meth_c_out_47(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </td>\n");
      out.write("     <td>\n");
      out.write("                                <div class='text-right'>\n");
      out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-ok'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
      out.write("                                        <i class='icon-remove'></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("</tr>\n");
      out.write("<!-- \n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" -->\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<hr class='hr-double' />\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("<!-- / jquery -->\n");
      out.write("<script src='assets/javascripts/jquery/jquery.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / jquery mobile events (for touch and slide) -->\n");
      out.write("<script src='assets/javascripts/plugins/mobile_events/jquery.mobile-events.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / jquery migrate (for compatibility with new jquery) -->\n");
      out.write("<script src='assets/javascripts/jquery/jquery-migrate.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / jquery ui -->\n");
      out.write("<script src='assets/javascripts/jquery_ui/jquery-ui.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / bootstrap -->\n");
      out.write("<script src='assets/javascripts/bootstrap/bootstrap.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/flot/excanvas.js' type='text/javascript'></script>\n");
      out.write("<!-- / sparklines -->\n");
      out.write("<script src='assets/javascripts/plugins/sparklines/jquery.sparkline.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / flot charts -->\n");
      out.write("<script src='assets/javascripts/plugins/flot/flot.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/flot/flot.resize.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/flot/flot.pie.js' type='text/javascript'></script>\n");
      out.write("<!-- / bootstrap switch -->\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_switch/bootstrapSwitch.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / fullcalendar -->\n");
      out.write("<script src='assets/javascripts/plugins/fullcalendar/fullcalendar.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / datatables -->\n");
      out.write("<script src='assets/javascripts/plugins/datatables/jquery.dataTables.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/datatables/jquery.dataTables.columnFilter.js' type='text/javascript'></script>\n");
      out.write("<!-- / wysihtml5 -->\n");
      out.write("<script src='assets/javascripts/plugins/common/wysihtml5.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/common/bootstrap-wysihtml5.js' type='text/javascript'></script>\n");
      out.write("<!-- / select2 -->\n");
      out.write("<script src='assets/javascripts/plugins/select2/select2.js' type='text/javascript'></script>\n");
      out.write("<!-- / color picker -->\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_colorpicker/bootstrap-colorpicker.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / mention -->\n");
      out.write("<script src='assets/javascripts/plugins/mention/mention.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / input mask -->\n");
      out.write("<script src='assets/javascripts/plugins/input_mask/bootstrap-inputmask.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / fileinput -->\n");
      out.write("<script src='assets/javascripts/plugins/fileinput/bootstrap-fileinput.js' type='text/javascript'></script>\n");
      out.write("<!-- / modernizr -->\n");
      out.write("<script src='assets/javascripts/plugins/modernizr/modernizr.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / retina -->\n");
      out.write("<script src='assets/javascripts/plugins/retina/retina.js' type='text/javascript'></script>\n");
      out.write("<!-- / fileupload -->\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/tmpl.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/load-image.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/canvas-to-blob.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/jquery.iframe-transport.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/jquery.fileupload.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/jquery.fileupload-fp.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/jquery.fileupload-ui.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/fileupload/jquery.fileupload-init.js' type='text/javascript'></script>\n");
      out.write("<!-- / timeago -->\n");
      out.write("<script src='assets/javascripts/plugins/timeago/jquery.timeago.js' type='text/javascript'></script>\n");
      out.write("<!-- / slimscroll -->\n");
      out.write("<script src='assets/javascripts/plugins/slimscroll/jquery.slimscroll.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / autosize (for textareas) -->\n");
      out.write("<script src='assets/javascripts/plugins/autosize/jquery.autosize-min.js' type='text/javascript'></script>\n");
      out.write("<!-- / charCount -->\n");
      out.write("<script src='assets/javascripts/plugins/charCount/charCount.js' type='text/javascript'></script>\n");
      out.write("<!-- / validate -->\n");
      out.write("<script src='assets/javascripts/plugins/validate/jquery.validate.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/validate/additional-methods.js' type='text/javascript'></script>\n");
      out.write("<!-- / naked password -->\n");
      out.write("<script src='assets/javascripts/plugins/naked_password/naked_password-0.2.4.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / nestable -->\n");
      out.write("<script src='assets/javascripts/plugins/nestable/jquery.nestable.js' type='text/javascript'></script>\n");
      out.write("<!-- / tabdrop -->\n");
      out.write("<script src='assets/javascripts/plugins/tabdrop/bootstrap-tabdrop.js' type='text/javascript'></script>\n");
      out.write("<!-- / jgrowl -->\n");
      out.write("<script src='assets/javascripts/plugins/jgrowl/jquery.jgrowl.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / bootbox -->\n");
      out.write("<script src='assets/javascripts/plugins/bootbox/bootbox.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / inplace editing -->\n");
      out.write("<script src='assets/javascripts/plugins/xeditable/bootstrap-editable.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/xeditable/wysihtml5.js' type='text/javascript'></script>\n");
      out.write("<!-- / ckeditor -->\n");
      out.write("<script src='assets/javascripts/plugins/ckeditor/ckeditor.js' type='text/javascript'></script>\n");
      out.write("<!-- / filetrees -->\n");
      out.write("<script src='assets/javascripts/plugins/dynatree/jquery.dynatree.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / datetime picker -->\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_datetimepicker/bootstrap-datetimepicker.js' type='text/javascript'></script>\n");
      out.write("<!-- / daterange picker -->\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_daterangepicker/moment.min.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_daterangepicker/bootstrap-daterangepicker.js' type='text/javascript'></script>\n");
      out.write("<!-- / max length -->\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_maxlength/bootstrap-maxlength.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / dropdown hover -->\n");
      out.write("<script src='assets/javascripts/plugins/bootstrap_hover_dropdown/twitter-bootstrap-hover-dropdown.min.js' type='text/javascript'></script>\n");
      out.write("<!-- / slider nav (address book) -->\n");
      out.write("<script src='assets/javascripts/plugins/slider_nav/slidernav-min.js' type='text/javascript'></script>\n");
      out.write("<!-- / fuelux -->\n");
      out.write("<script src='assets/javascripts/plugins/fuelux/wizard.js' type='text/javascript'></script>\n");
      out.write("<!-- / flatty theme -->\n");
      out.write("<script src='assets/javascripts/nav.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/tables.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/theme.js' type='text/javascript'></script>\n");
      out.write("<!-- / demo -->\n");
      out.write("<script src='assets/javascripts/demo/jquery.mockjax.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/demo/inplace_editing.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/demo/charts.js' type='text/javascript'></script>\n");
      out.write("<script src='assets/javascripts/demo/demo.js' type='text/javascript'></script>\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue(new String("11111111 "));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue(new String("紅色 "));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue(new String("XXL"));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue(new String("11111111 "));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent(null);
    _jspx_th_c_out_6.setValue(new String("紅色 "));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent(null);
    _jspx_th_c_out_7.setValue(new String("XXL"));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent(null);
    _jspx_th_c_out_8.setValue(new String("11111111 "));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent(null);
    _jspx_th_c_out_9.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent(null);
    _jspx_th_c_out_10.setValue(new String("紅色 "));
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_c_out_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent(null);
    _jspx_th_c_out_11.setValue(new String("XXL"));
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_c_out_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent(null);
    _jspx_th_c_out_12.setValue(new String("11111111 "));
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }

  private boolean _jspx_meth_c_out_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_13.setPageContext(_jspx_page_context);
    _jspx_th_c_out_13.setParent(null);
    _jspx_th_c_out_13.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
    if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
    return false;
  }

  private boolean _jspx_meth_c_out_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_14.setPageContext(_jspx_page_context);
    _jspx_th_c_out_14.setParent(null);
    _jspx_th_c_out_14.setValue(new String("紅色 "));
    int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
    if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
    return false;
  }

  private boolean _jspx_meth_c_out_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_15.setPageContext(_jspx_page_context);
    _jspx_th_c_out_15.setParent(null);
    _jspx_th_c_out_15.setValue(new String("XXL"));
    int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
    if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
    return false;
  }

  private boolean _jspx_meth_c_out_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_16.setPageContext(_jspx_page_context);
    _jspx_th_c_out_16.setParent(null);
    _jspx_th_c_out_16.setValue(new String("11111111 "));
    int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
    if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
    return false;
  }

  private boolean _jspx_meth_c_out_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_17.setPageContext(_jspx_page_context);
    _jspx_th_c_out_17.setParent(null);
    _jspx_th_c_out_17.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
    if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
    return false;
  }

  private boolean _jspx_meth_c_out_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_18.setPageContext(_jspx_page_context);
    _jspx_th_c_out_18.setParent(null);
    _jspx_th_c_out_18.setValue(new String("紅色 "));
    int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
    if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
    return false;
  }

  private boolean _jspx_meth_c_out_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_19.setPageContext(_jspx_page_context);
    _jspx_th_c_out_19.setParent(null);
    _jspx_th_c_out_19.setValue(new String("XXL"));
    int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
    if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
    return false;
  }

  private boolean _jspx_meth_c_out_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_20.setPageContext(_jspx_page_context);
    _jspx_th_c_out_20.setParent(null);
    _jspx_th_c_out_20.setValue(new String("11111111 "));
    int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
    if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
    return false;
  }

  private boolean _jspx_meth_c_out_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_21.setPageContext(_jspx_page_context);
    _jspx_th_c_out_21.setParent(null);
    _jspx_th_c_out_21.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
    if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
    return false;
  }

  private boolean _jspx_meth_c_out_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_22.setPageContext(_jspx_page_context);
    _jspx_th_c_out_22.setParent(null);
    _jspx_th_c_out_22.setValue(new String("紅色 "));
    int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
    if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
    return false;
  }

  private boolean _jspx_meth_c_out_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_23.setPageContext(_jspx_page_context);
    _jspx_th_c_out_23.setParent(null);
    _jspx_th_c_out_23.setValue(new String("XXL"));
    int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
    if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
    return false;
  }

  private boolean _jspx_meth_c_out_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_24.setPageContext(_jspx_page_context);
    _jspx_th_c_out_24.setParent(null);
    _jspx_th_c_out_24.setValue(new String("11111111 "));
    int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
    if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
    return false;
  }

  private boolean _jspx_meth_c_out_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_25.setPageContext(_jspx_page_context);
    _jspx_th_c_out_25.setParent(null);
    _jspx_th_c_out_25.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
    if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
    return false;
  }

  private boolean _jspx_meth_c_out_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_26.setPageContext(_jspx_page_context);
    _jspx_th_c_out_26.setParent(null);
    _jspx_th_c_out_26.setValue(new String("紅色 "));
    int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
    if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
    return false;
  }

  private boolean _jspx_meth_c_out_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_27.setPageContext(_jspx_page_context);
    _jspx_th_c_out_27.setParent(null);
    _jspx_th_c_out_27.setValue(new String("XXL"));
    int _jspx_eval_c_out_27 = _jspx_th_c_out_27.doStartTag();
    if (_jspx_th_c_out_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
    return false;
  }

  private boolean _jspx_meth_c_out_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_28.setPageContext(_jspx_page_context);
    _jspx_th_c_out_28.setParent(null);
    _jspx_th_c_out_28.setValue(new String("11111111 "));
    int _jspx_eval_c_out_28 = _jspx_th_c_out_28.doStartTag();
    if (_jspx_th_c_out_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
    return false;
  }

  private boolean _jspx_meth_c_out_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_29.setPageContext(_jspx_page_context);
    _jspx_th_c_out_29.setParent(null);
    _jspx_th_c_out_29.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_29 = _jspx_th_c_out_29.doStartTag();
    if (_jspx_th_c_out_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
    return false;
  }

  private boolean _jspx_meth_c_out_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_30.setPageContext(_jspx_page_context);
    _jspx_th_c_out_30.setParent(null);
    _jspx_th_c_out_30.setValue(new String("紅色 "));
    int _jspx_eval_c_out_30 = _jspx_th_c_out_30.doStartTag();
    if (_jspx_th_c_out_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
    return false;
  }

  private boolean _jspx_meth_c_out_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_31.setPageContext(_jspx_page_context);
    _jspx_th_c_out_31.setParent(null);
    _jspx_th_c_out_31.setValue(new String("XXL"));
    int _jspx_eval_c_out_31 = _jspx_th_c_out_31.doStartTag();
    if (_jspx_th_c_out_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
    return false;
  }

  private boolean _jspx_meth_c_out_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_32.setPageContext(_jspx_page_context);
    _jspx_th_c_out_32.setParent(null);
    _jspx_th_c_out_32.setValue(new String("11111111 "));
    int _jspx_eval_c_out_32 = _jspx_th_c_out_32.doStartTag();
    if (_jspx_th_c_out_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
    return false;
  }

  private boolean _jspx_meth_c_out_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_33.setPageContext(_jspx_page_context);
    _jspx_th_c_out_33.setParent(null);
    _jspx_th_c_out_33.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_33 = _jspx_th_c_out_33.doStartTag();
    if (_jspx_th_c_out_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
    return false;
  }

  private boolean _jspx_meth_c_out_34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_34.setPageContext(_jspx_page_context);
    _jspx_th_c_out_34.setParent(null);
    _jspx_th_c_out_34.setValue(new String("紅色 "));
    int _jspx_eval_c_out_34 = _jspx_th_c_out_34.doStartTag();
    if (_jspx_th_c_out_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
    return false;
  }

  private boolean _jspx_meth_c_out_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_35.setPageContext(_jspx_page_context);
    _jspx_th_c_out_35.setParent(null);
    _jspx_th_c_out_35.setValue(new String("XXL"));
    int _jspx_eval_c_out_35 = _jspx_th_c_out_35.doStartTag();
    if (_jspx_th_c_out_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
    return false;
  }

  private boolean _jspx_meth_c_out_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_36.setPageContext(_jspx_page_context);
    _jspx_th_c_out_36.setParent(null);
    _jspx_th_c_out_36.setValue(new String("11111111 "));
    int _jspx_eval_c_out_36 = _jspx_th_c_out_36.doStartTag();
    if (_jspx_th_c_out_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
    return false;
  }

  private boolean _jspx_meth_c_out_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_37.setPageContext(_jspx_page_context);
    _jspx_th_c_out_37.setParent(null);
    _jspx_th_c_out_37.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_37 = _jspx_th_c_out_37.doStartTag();
    if (_jspx_th_c_out_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
    return false;
  }

  private boolean _jspx_meth_c_out_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_38.setPageContext(_jspx_page_context);
    _jspx_th_c_out_38.setParent(null);
    _jspx_th_c_out_38.setValue(new String("紅色 "));
    int _jspx_eval_c_out_38 = _jspx_th_c_out_38.doStartTag();
    if (_jspx_th_c_out_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
    return false;
  }

  private boolean _jspx_meth_c_out_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_39 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_39.setPageContext(_jspx_page_context);
    _jspx_th_c_out_39.setParent(null);
    _jspx_th_c_out_39.setValue(new String("XXL"));
    int _jspx_eval_c_out_39 = _jspx_th_c_out_39.doStartTag();
    if (_jspx_th_c_out_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
    return false;
  }

  private boolean _jspx_meth_c_out_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_40 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_40.setPageContext(_jspx_page_context);
    _jspx_th_c_out_40.setParent(null);
    _jspx_th_c_out_40.setValue(new String("11111111 "));
    int _jspx_eval_c_out_40 = _jspx_th_c_out_40.doStartTag();
    if (_jspx_th_c_out_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
    return false;
  }

  private boolean _jspx_meth_c_out_41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_41 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_41.setPageContext(_jspx_page_context);
    _jspx_th_c_out_41.setParent(null);
    _jspx_th_c_out_41.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_41 = _jspx_th_c_out_41.doStartTag();
    if (_jspx_th_c_out_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
    return false;
  }

  private boolean _jspx_meth_c_out_42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_42 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_42.setPageContext(_jspx_page_context);
    _jspx_th_c_out_42.setParent(null);
    _jspx_th_c_out_42.setValue(new String("紅色 "));
    int _jspx_eval_c_out_42 = _jspx_th_c_out_42.doStartTag();
    if (_jspx_th_c_out_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
    return false;
  }

  private boolean _jspx_meth_c_out_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_43 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_43.setPageContext(_jspx_page_context);
    _jspx_th_c_out_43.setParent(null);
    _jspx_th_c_out_43.setValue(new String("XXL"));
    int _jspx_eval_c_out_43 = _jspx_th_c_out_43.doStartTag();
    if (_jspx_th_c_out_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
    return false;
  }

  private boolean _jspx_meth_c_out_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_44 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_44.setPageContext(_jspx_page_context);
    _jspx_th_c_out_44.setParent(null);
    _jspx_th_c_out_44.setValue(new String("11111111 "));
    int _jspx_eval_c_out_44 = _jspx_th_c_out_44.doStartTag();
    if (_jspx_th_c_out_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
    return false;
  }

  private boolean _jspx_meth_c_out_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_45 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_45.setPageContext(_jspx_page_context);
    _jspx_th_c_out_45.setParent(null);
    _jspx_th_c_out_45.setValue(new String("T-shirt"));
    int _jspx_eval_c_out_45 = _jspx_th_c_out_45.doStartTag();
    if (_jspx_th_c_out_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
    return false;
  }

  private boolean _jspx_meth_c_out_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_46 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_46.setPageContext(_jspx_page_context);
    _jspx_th_c_out_46.setParent(null);
    _jspx_th_c_out_46.setValue(new String("紅色 "));
    int _jspx_eval_c_out_46 = _jspx_th_c_out_46.doStartTag();
    if (_jspx_th_c_out_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
    return false;
  }

  private boolean _jspx_meth_c_out_47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_47 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_47.setPageContext(_jspx_page_context);
    _jspx_th_c_out_47.setParent(null);
    _jspx_th_c_out_47.setValue(new String("XXL"));
    int _jspx_eval_c_out_47 = _jspx_th_c_out_47.doStartTag();
    if (_jspx_th_c_out_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("export");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exports}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\n");
          out.write("\t\n");
          out.write("\t\n");
          out.write("\t\n");
          out.write("\t<tr>\n");
          out.write("    <td>");
          if (_jspx_meth_c_out_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("    <td>");
          if (_jspx_meth_c_out_49((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("    <td>\n");
          out.write("        ");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("        \n");
          out.write("    </td>\n");
          out.write("    <td>\n");
          out.write("        ");
          if (_jspx_meth_c_out_50((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("    </td>\n");
          out.write("      <td>\n");
          out.write("\t");
          if (_jspx_meth_c_out_51((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("    </td>\n");
          out.write("     <td>\n");
          out.write("                                <div class='text-right'>\n");
          out.write("                                    <a class='btn btn-success btn-mini' href='#'>\n");
          out.write("                                        <i class='icon-ok'></i>\n");
          out.write("                                    </a>\n");
          out.write("                                    <a class='btn btn-danger btn-mini' href='#'>\n");
          out.write("                                        <i class='icon-remove'></i>\n");
          out.write("                                    </a>\n");
          out.write("                                </div>\n");
          out.write("                            </td>\n");
          out.write("</tr>\n");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_48 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_48.setPageContext(_jspx_page_context);
    _jspx_th_c_out_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_48.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${export.exportNo} ", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_48 = _jspx_th_c_out_48.doStartTag();
    if (_jspx_th_c_out_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
    return false;
  }

  private boolean _jspx_meth_c_out_49(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_49 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_49.setPageContext(_jspx_page_context);
    _jspx_th_c_out_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_49.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${export.exportType} ", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_49 = _jspx_th_c_out_49.doStartTag();
    if (_jspx_th_c_out_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${export.exportDate}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_out_50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_50 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_50.setPageContext(_jspx_page_context);
    _jspx_th_c_out_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_50.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${export.exportColor} ", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_50 = _jspx_th_c_out_50.doStartTag();
    if (_jspx_th_c_out_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
    return false;
  }

  private boolean _jspx_meth_c_out_51(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_51 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_51.setPageContext(_jspx_page_context);
    _jspx_th_c_out_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_51.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${export.exportSize} ", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_51 = _jspx_th_c_out_51.doStartTag();
    if (_jspx_th_c_out_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
    return false;
  }
}
