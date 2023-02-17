<%@ page import="blackboard.portal.data.ExtraInfo" %>
<%@ page import="blackboard.platform.plugin.PlugInUtil" %>
<%@ taglib uri="/bbNG" prefix="bbNG" %>
<%@ taglib uri="/bbUI" prefix="bbUI" %>

<bbNG:genericPage title="Migrate B2 Content configuration" entitlement="system.buildingblocks.VIEW">
	<bbNG:pageHeader>
		<bbNG:breadcrumbBar environment="SYS_ADMIN"/>
		<bbNG:pageTitleBar>
			Migrate B2 Content to LTI configuration
		</bbNG:pageTitleBar>
	</bbNG:pageHeader>

	<bbNG:breadcrumbBar environment="SYS_ADMIN" navItem="admin_plugin_manage">
		<bbNG:breadcrumb>Configure AMIGB2LTI</bbNG:breadcrumb>
	</bbNG:breadcrumbBar>

	<bbUI:caretList>
        <% String url = PlugInUtil.getPlugInManagerURL(); %>
		<bbUI:caret title="" >
			<span id="mig1" style="<%= true ? "" : "display: none;"%> font-size: 110%; font-weight: bold; color: inherit; font-family: inherit; font-style: normal;">MIG1.</span>
			<br />
			<br />
			<br />
			<span id="mig2" style="<%= true ? "" : "display: none;"%> font-size: 110%; font-weight: bold; color: inherit; font-family: inherit; font-style: normal;">MIG2.</span>
			<br />
			<a id="mig3" style="<%= true ? "" : "display: none;"%>" href="${uriStem}/learnhello"> Finalize migration process.</a>
		</bbUI:caret>

	</bbUI:caretList>

	<bbNG:okButton url="/webapps/blackboard/admin/manage_plugins.jsp"/>
</bbNG:genericPage>