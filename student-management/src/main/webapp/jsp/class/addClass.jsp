<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Thêm lớp học</h1>
				</div>
				<!-- /.col-lg-12 -->
				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-default">
							<div class="panel-heading">Basic Form Elements</div>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<form:form role="form" action="" method="post">
										<div class="form-group">
                                            <form:label path="code">Mã lớp</form:label>
                                            <form:input path="code" class="form-control" name="code" />
                                        </div>
                                        <div class="form-group">
                                            <form:label path="name">Tên lớp</form:label>
                                            <form:input path="name" class="form-control" name="name" />
                                        </div>
                                        <button type="submit" class="btn btn-default">Save</button>
                                        <button type="reset" class="btn btn-default">Reset Button</button>
									</form:form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>