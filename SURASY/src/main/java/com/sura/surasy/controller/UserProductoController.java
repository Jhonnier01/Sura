package com.sura.surasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sura.surasy.model.UserProducto;
import com.sura.surasy.repository.UserProductoRepository;

@RestController // Defines that this class is a spring bean
@RequestMapping("/surasy")
public class UserProductoController {

	@Autowired
	UserProductoRepository userProductoRepository;

	@GetMapping("/consultarUserProductos")
	public List<UserProducto> getAllUserProducto() {
		return userProductoRepository.findAll();
	}

	@PostMapping("/insertarUserProductos")
	public List<UserProducto> saveListUserProducto(@RequestBody List<UserProducto> userproducto) {
		return userProductoRepository.saveAll(userproducto);
	}

}
