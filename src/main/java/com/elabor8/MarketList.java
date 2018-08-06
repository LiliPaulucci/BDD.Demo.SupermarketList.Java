package com.elabor8;
import org.jinq.jpa.JinqJPAStreamProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MarketList
{
    public List<MarketProduct> Contents;
    private MarketProduct _product;

    public MarketList()
    {
        Contents = new ArrayList<>();
    }

    public void Add(MarketProduct product)
    {
        Contents.add(product);
    }


    public int GetQuantity(String v)
    {
        MarketProduct product = null;
        for (MarketProduct marketProduct:
                    this.Contents) {
                if (marketProduct.Description == v) {
                    product = marketProduct;
                }
            }

        if (product == null)
            return 0;

        return product.Quantity;
    }

    public void Remove(String p0)
    {
        //var product = Contents.Find(x => x.Description == p0);
        MarketProduct product = findProductByDescription(p0);
        Contents.remove(product);
    }

    public void Remove(String p1, int p0)
    {
        //var product = Contents.Find(x => x.Description == p1);
        //database.customerStream().where(
        //  customer -> customer.getName().equals("Alice"));

        MarketProduct product = findProductByDescription(p1);

        if (p0 > product.Quantity)
            product.Quantity = 0;
        else
           product.Quantity = product.Quantity - p0;
    }

    public Collection<MarketProduct> findByDescription(String desc) {
        List<MarketProduct> list = new ArrayList<>();
        for (MarketProduct marketProduct:
                this.Contents) {
            if (marketProduct.Description == desc) {
                list.add(marketProduct);
            }
        }
        return list;
    }

    public MarketProduct findProductByDescription(String desc) {
        MarketProduct product = null;
        for (MarketProduct marketProduct:
                this.Contents) {
            if (marketProduct.Description == desc) {
                product = marketProduct;
            }
        }
        return product;
    }

}



