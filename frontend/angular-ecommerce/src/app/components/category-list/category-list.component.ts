import { Component, OnInit } from '@angular/core';
import { ProductCategory } from 'src/app/common/product-category';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {

  categories: ProductCategory[] = [];

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.listProductCategories();
  }

  listProductCategories() {
    
    this.productService.getProductCategories().subscribe(
      data => {
        console.log("Product categories = " + JSON.stringify(data));
        this.categories = data;
      }
    );
  }

}
