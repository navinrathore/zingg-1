<html>
<head>
	<title>${title!}</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<a class="navbar-brand" href="https://www.zingg.ai">
			<img src="https://github.com/zinggai/zingg/raw/main/assets/zinggWhiteTransparent.png" class="d-inline-block align-top" alt="">
		</a>
		<h1> ${title!} </h1>
		<a href="#">
		<div class="justify-content-end">Model ${modelId}</div>
		</a>
	</nav>

	<table class="table table-borderless" style="width:auto" >
			<thead class="thead thead-dark">
			</thead>
	<tbody>
			<tr>
				<th>Field Name</th>
				<th>Field Type</th>
				<th>Nullable</th>
			</tr>
			<#list dataFieldsList as field>
				<tr>
					<td>
					${field[0]!}
					</td>
					<td>
					${field[1]!}
					</td>
					<td>
					${field[2]!}
					</td>
				</tr>
			</#list>
	</tbody>
	</table>

</body>
</html>
<style>
		.header{
				position:sticky;
				top: 0 ;
		}
</style>