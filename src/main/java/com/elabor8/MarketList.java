package com.elabor8;
import java.util.List;
import java.util.ArrayList;

public class MarketList
{
    public List<MarketProduct> Contents;

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
        MarketProduct product = null;
        for (MarketProduct marketProduct:
                this.Contents) {
            if (marketProduct.Description == p0) {
                product = marketProduct;
            }
        }
        Contents.remove(product);
    }

    public void Remove(String p1, int p0)
    {
        //var product = Contents.Find(x => x.Description == p1);
        MarketProduct product = null;
        for (MarketProduct marketProduct:
                this.Contents) {
            if (marketProduct.Description == p1) {
                product = marketProduct;
            }
        }
        if (p0 > product.Quantity)
            product.Quantity = 0;
        else
           product.Quantity = product.Quantity - p0;
    }

}



