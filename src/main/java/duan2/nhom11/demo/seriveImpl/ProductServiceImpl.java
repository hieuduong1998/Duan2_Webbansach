package duan2.nhom11.demo.seriveImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duan2.nhom11.demo.entity.Product;
import duan2.nhom11.demo.repository.ProductRepository;
import duan2.nhom11.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void save(Product product) {
		productRepository.save(product);

	}

	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Long count() {

		return productRepository.count();
	}

	@Override
	public Optional<Product> findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);

	}

}
