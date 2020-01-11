package service;

import dao.ShowPriceDao;
import dao.ShowPriceDaoImpl;
import entity.ShowPrice;

import java.util.List;

public class ShowPriceServiceImpl implements ShowPriceService {
    private  ShowPriceDao showPriceDao = new ShowPriceDaoImpl();
    @Override
    public List<ShowPrice> showPrice() {
        return showPriceDao.showPrice();
    }
}
