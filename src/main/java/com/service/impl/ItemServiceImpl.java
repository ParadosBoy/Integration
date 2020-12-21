package com.service.impl;

import com.dao.ItemMapper;
import com.pojo.Item;
import com.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 10574
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;

    @Override
    public List<Item> queryItemList() {
        List<Item> list = this.itemMapper.selectByExample(null);
        return list;
    }
}
