// Fetch product by ID and display image and price
const container = document.getElementById('product-container');
const input = document.getElementById('product-id-input');
const btn = document.getElementById('search-btn');

function fetchProductById(productId) {
	container.innerHTML = 'Loading...';
	fetch(`https://dummyjson.com/products/${productId}`)
		.then(res => {
			if (!res.ok) throw new Error('Not found');
			return res.json();
		})
		.then(product => {
			container.innerHTML = `
				<h2>Title:${product.title}</h2>
                <h2>Category: ${product.category}</h2>
                <h2>Stock: ${product.stock}</h2>
				<img src="${product.thumbnail}" alt="${product.title}" style="max-width:200px;display:block;">
				   <h2>Rating: ${product.rating}</h2>
                   <p>Price: $${product.price}</p>
			`;
		})
		.catch(err => {
			container.textContent = 'Product not found.';
		});
}

btn.addEventListener('click', () => {
	const id = input.value;
	if (id) fetchProductById(id);
});

// Optionally, fetch a default product on load
fetchProductById(1);
