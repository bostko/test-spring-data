package com.valentinaitken.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.ImmutableSet;
import com.valentinaitken.test.configuration.TestsConfiguration;
import com.valentinaitken.test.domain.Product;
import com.valentinaitken.test.domain.Widget;
import com.valentinaitken.test.repository.ProductRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestsConfiguration.class)
@Transactional
public class ProductSavingTest {
  @Autowired
  private ProductRepository productRepository;

  @Test
  public void testDoubleSaving() {
    final ImmutableSet.Builder<Widget> set = new ImmutableSet.Builder();

    final Widget widget1 = new Widget();
    widget1.setName("hammer");
    set.add(widget1);

    final Widget widget2 = new Widget();
    widget2.setName("axel");
    set.add(widget2);

    final Product product = new Product();
    product.setWidgets(set.build());

    final Product savedProduct = productRepository.save(product);
    productRepository.save(savedProduct);
  }
}
