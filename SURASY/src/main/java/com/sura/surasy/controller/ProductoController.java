package com.sura.surasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sura.surasy.model.Producto;
import com.sura.surasy.repository.ProductoRepository;

@RestController // Defines that this class is a spring bean
@CrossOrigin(origins = "*")
@RequestMapping("/surasy")
public class ProductoController {

	@Autowired
	ProductoRepository productoRepository;

	@GetMapping("/consultarProductos")
	public List<Producto> getAllProducto() {
		return productoRepository.findAll();
	}

	@PostMapping("/insertarProductos")
	public List<Producto> saveListProductos(@RequestBody List<Producto> producto) {
		return productoRepository.saveAll(producto);
	}

}
