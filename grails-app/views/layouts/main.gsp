<!DOCTYPE html>
<%@ page import="grails.util.Environment" %>
<html>
<head>
  <title><g:layoutTitle default="Grails"/></title>
  <link href="${resource(dir: 'css', file: 'screen.css')}" media="screen, projection" rel="stylesheet" type="text/css"/>
  <link href="${resource(dir: 'css', file: 'print.css')}" media="print" rel="stylesheet" type="text/css"/>
  <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
  <g:layoutHead/>
  <g:if test="Environment.current == Environment.DEVELOPMENT">
    <script data-main="js/src/main" src="js/lib/require.js" type="text/javascript"></script>
  </g:if>
  <g:else>
    <script data-main="js/pkg/main" src="js/lib/require.js" type="text/javascript"></script>
  </g:else>
</head>

<body>
<div id="spinner" class="spinner" style="display:none;">
  <img src="${resource(dir: 'images', file: 'spinner.gif')}"
       alt="${message(code: 'spinner.alt', default: 'Loading...')}"/>
</div>

<div id="grailsLogo"><a href="http://grails.org"><img src="${resource(dir: 'images', file: 'grails_logo.png')}"
                                                      alt="Grails" border="0"/></a></div>
<g:layoutBody/>
</body>
</html>
