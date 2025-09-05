package br.com.techmarket.api.repository;

import br.com.techmarket.api.model.ItemDoProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ItemDoProdutoRepository extends JpaRepository<ItemDoProduto, Integer> {
}
