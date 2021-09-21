package apiproduto.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiproduto.produto.models.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{
	
	Produtos findById(long id);

}
