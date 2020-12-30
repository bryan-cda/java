<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>BB</title>
	</head>
	<body>
		<h1>Welcome to ByteBank</h1>
		<h2>Let's go?</h2>
		<a href="bytebank.jsp">Home</a>
	
		<form action="/bytebank/banks">
			<table>
				<thead>
					<tr>
						<td>
							<label>
							Name:
							</label>
						</td>
						<td>
							<label>
							CPF:
							</label>
						</td>
						<td>
							<label>
							Address:
							</label>
						</td>
						<td>
							<label>
							Birthday:
							</label>
						</td>
						<td>
							<label>
							Telephone:
							</label>
						</td>
						<td>
							<label>
							E-mail:
							</label>
						</td>
						<td>
							<label>
							Login:
							</label>
						</td>
						<td>
							<label>
							Password:
							</label>
						</td>
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>
							<input type="text" name="name">
						</td>
						<td>
							<input type="text" name="cpf">
						</td>
						<td>
							<input type="text" name="address">
						</td>
						<td>
							<input type="date" name="birthday">
						</td>
						<td>
							<input type="text" name="telephone">
						</td>
						<td>
							<input type="email" name="email">
						</td>
						<td>
							<input type="text" name="login">
						</td>
						<td>
							<input type="password" name="password">
						</td>
					</tr>
				</tbody>
			</table>
			<input type="submit" value="Send">
		</form>
	</body>
</html>