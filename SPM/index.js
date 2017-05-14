var express = require('express');
var session = require('express-session');

var app = express();

app.use(express.static('public'));

app.set('views', './views');
app.set('view engine', 'pug');

app.use(session({'secret': 'secret', 'resave': true, 'saveUninitialized': true}));


app.get('/login', function(request, response) {
	var user = request.query['user'];
	request.session.user = user;
	request.session.cart = [];
	response.render('welcome', {title: 'Welcome Page', user: user});
});


app.get('/additem', function(request, response) {
	var item = request.query['item'];
	var price = parseFloat(request.query['price']).toFixed(2);
	var qty = request.query['qty'];
	var cartItem = {'item': item, 'price': price, 'qty': qty};
	request.session.cart.push(cartItem);
	response.render('item', {'title': 'Item Added', 'message': 'The item has been added to your cart.'});
});


app.get('/removeitem', function(request, response) {
	var itemIndex = request.query['index'];
	request.session.cart.splice(itemIndex, 1);
	response.render('item', {'title': 'Item Removed', 'message': 'The item has been removed from your cart.'});
});


app.get('/cart', function(request, response) {
	var user = request.session.user;
	var cart = request.session.cart;
	response.render('cart', {'user': user, 'cart': cart});
});


app.get('/logout', function(request, response) {
	request.session.destroy();
	response.send(`
		<!doctype html>
		<html>
		<head><title>Check Out</title></head>
		<body>
			<h1>Goodbye!</h1>
			<p>We will deliver your orders shortly.</p>
			<p>You have been logged out.</p>
			<p>Go back to the <a href='/index.html'>Home Page</a></p>
		</body>
		</html>
	`);
});


// invoke as 'http://localhost:81/imagefilename'..
app.get('/images/:name', function(request, response) {
	var fs = require('fs');
	var filename = request.params.name;

	try {
		var data = fs.readFileSync(filename);
		response.status(200);
		response.set({
			'Content-Type': 'image/jpg',
			'Content-Length': data.length
		});
		response.send(data);
	} catch (e) {
		response.status(404);
		response.send();
	}
});


app.listen(81);
