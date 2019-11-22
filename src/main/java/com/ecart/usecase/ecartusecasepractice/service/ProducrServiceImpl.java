package com.ecart.usecase.ecartusecasepractice.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecart.usecase.ecartusecasepractice.DTO.ProductDTO;
import com.ecart.usecase.ecartusecasepractice.model.Product;
import com.ecart.usecase.ecartusecasepractice.repository.ProductRepository;

public class ProducrServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	org.slf4j.Logger logger = LoggerFactory.getLogger(ProducrServiceImpl.class);

	@Override
	public List<ProductDTO> getProducts() {
		logger.info(" :: getProducts -----STARTS ---- ");

		List<ProductDTO> productsDto = new ArrayList<>();
		List<Product> products = productRepository.findAll();

		logger.info(" :: getProducts -----products ---- {} ", products.size());
		products.stream().forEach(hospital -> {
			ProductDTO hospitalDto = new ProductDTO();
			BeanUtils.copyProperties(products, hospitalDto);
			productsDto.add(hospitalDto);
		});
		logger.info(" :: getProducts -----END ---- ");
		return productsDto;
	}
}
