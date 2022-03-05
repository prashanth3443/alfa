package com.example.Gen.service;

import com.example.Gen.module.Gf;
import com.example.Gen.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GirlImplementationSer implements GirlInterface
{
    @Autowired
    GirlRepository girlRepository;
    @Override
    public void create(Gf g)
    {
        girlRepository.save(g);
    }

    @Override
    public List<Gf> getAll()
    {
        return girlRepository.findAll();
    }

    @Override
    public void update(Gf g)
    {
        girlRepository.save(g);
    }

    @Override
    public void deleteById(int id)
    {
        girlRepository.deleteById(id);
    }
}
