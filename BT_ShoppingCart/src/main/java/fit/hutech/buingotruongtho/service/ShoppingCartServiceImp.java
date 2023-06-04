/*package fit.hutech.buingotruongtho.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fit.hutech.buingotruongtho.model.Cartitem;

@Service
public class ShoppingCartServiceImp implements ShoppingCartService{
    Map<Integer,Cartitem> shoppingCart = new HashMap<>();

    @Override
    public void add(Cartitem newItem) {
        Cartitem cartItem = shoppingCart.get(newItem.getProductId());
        if(cartItem==null)
        {
            shoppingCart.put(newItem.getProductId(),newItem);
        }else{
            cartItem.setQuantity(cartItem.getQuantity()+1);
        }
    }

    @Override
    public void remove(int id) {
        shoppingCart.remove(id);
    }

    @Override
    public Cartitem update(int productID, int quantity) {
        Cartitem cartItem = shoppingCart.get(productID);
        cartItem.setQuantity(quantity);
        return cartItem;
    }

    @Override
    public void clear() {
        shoppingCart.clear();
    }

    @Override
    public double getAmount() {
        return shoppingCart.values().stream()
                            .mapToDouble(item->item.getQuantity()*item.getPrice()).sum();
    }

    @Override
    public int getCount() {
        return shoppingCart.values().size();
    }

    @Override
    public Collection<Cartitem> getAllItems() {
        return shoppingCart.values();
    }
}   */
