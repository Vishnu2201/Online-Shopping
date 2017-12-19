<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">

	<div class="row">

		<c:if test="${not empty message}">

			<div class="col-xs-12">
				<div class="alert alert-sucess alert-dismissible">

					<button type="button" class="close" data-dismiss="alert">&times;</button>

					${message}


				</div>
			</div>

		</c:if>

		<div class="row">

			<div class="col-md-offset-2 col-md-8">

				<div class="panel panel-primary">

					<div class="panel-heading">

						<h4>Product Management</h4>

					</div>

					<div class="panel-body">
					
					<!-- Form Elements -->
					
						<sf:form class="form-horizontal" modelAttribute="product"
							action="${contextRoot}/manage/products" method="POST"
							enctype="multipart/form-data">

							<div class="form-group">
								<label class="control-label col-md-4">Enter The Name</label>
								<div class="col-md-8">
									<sf:input type="text" path="name" class="form-control"
										placeholder="Product Name" />
									<sf:errors path="name" cssClass="help-block" element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Enter The Brand</label>
								<div class="col-md-8">
									<sf:input type="text" path="brand" class="form-control"
										placeholder="Brand Name" />
									<sf:errors path="brand" cssClass="help-block" element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Product
									Description</label>
								<div class="col-md-8">
									<sf:textarea path="description" class="form-control"
										placeholder="Enter your description here!" />
									<sf:errors path="description" cssClass="help-block"
										element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Enter Unit Price</label>
								<div class="col-md-8">
									<sf:input type="number" path="unitPrice" class="form-control"
										placeholder="Enter Unit Price" />
									<sf:errors path="unitPrice" cssClass="help-block" element="em" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Quantity Availale</label>
								<div class="col-md-8">
									<sf:input type="number" path="quantity" class="form-control"
										placeholder="Enter Quantity" />
									<sf:errors path="quantity" cssClass="help-block" element="em" />
								</div>
							</div>


							<div class="form-group">
								<label class="control-label col-md-4">Upload a file</label>
								<div class="col-md-8">
									<sf:input type="file" path="file" class="form-control" />
									<sf:errors path="file" cssClass="help-block" element="em" />
								</div>
							</div>


							<div class="form-group">
								<label class="control-label col-md-4">Select Category</label>
								<div class="col-md-8">
									<sf:select class="form-control" path="categoryId" items="${categories}"
										id="categoryId" itemLabel="name" itemValue="id"  />


								</div>

							</div>


							<div class="form-group">
								<div class="col-md-offset-4 col-md-8">
									<input type="submit" name="submit" value="submit" id="submit"
										class="btn btn-primary" />
								<!-- Hidden fields for product -->
									
										<sf:hidden path="id" />
										<sf:hidden path="code" />
										<sf:hidden path="supplierId" />
										<sf:hidden path="active"/>
										<sf:hidden path="purchases"/>
										<sf:hidden path="views" />
									
								</div>

							</div>

						</sf:form>

					</div>

				</div>

			</div>


		</div>




		<div class="row">




			<hr />
			<h1>Available Products</h1>
			<hr />


			<div class='col-xs-12'>
				<div style="overflow: auto">



					<table id="adminProductsTable"
						class="table table-striped table-bordered">

						<thead>
							<tr>
								<th>Id</th>
								<th>&#160;</th>
								<th>Name</th>
								<th>Brand</th>
								<th>Qty. Avail</th>
								<th>Unit Price</th>
								<th>Activate</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th>4</th>
								<th><img class="adminDataTableImg"
									src="${contextRoot}/resources/images/PRDMNO123PQRX.jpg"
									alt="Macbook Pro" /></th>
								<th>Macbook Pro</th>
								<th>apple</th>
								<th>3</th>
								<th>&#8377; 54000/-</th>
								<th><label class="switch"> <input type="checkbox"
										checked="checked" value="4" />
										<div class="slider"></div>
								</label></th>
								<th><a href="${contextRoot}/manage/4/product"
									class="btn btn-warning"> <span
										class="glyphicon glyphicon-pencil"></span>
								</a></th>
							</tr>


							<tr>
								<th>4</th>
								<th><img class="adminDataTableImg"
									src="${contextRoot}/resources/images/PRDMNO123PQRX.jpg"
									alt="Macbook Pro" /></th>
								<th>Macbook Pro</th>
								<th>apple</th>
								<th>3</th>
								<th>&#8377; 54000/-</th>
								<th><label class="switch"> <input type="checkbox"
										value="4" />
										<div class="slider"></div>
								</label></th>
								<th><a href="${contextRoot}/manage/4/product"
									class="btn btn-warning"> <span
										class="glyphicon glyphicon-pencil"></span>
								</a></th>
							</tr>


						</tbody>

						<tfoot>
							<tr>
								<th>Id</th>
								<th>&#160;</th>
								<th>Name</th>
								<th>Brand</th>
								<th>Qty. Avail</th>
								<th>Unit Price</th>
								<th>Activate</th>
								<th>Edit</th>
							</tr>
						</tfoot>


					</table>


				</div>
			</div>
		</div>


	</div>
</div>