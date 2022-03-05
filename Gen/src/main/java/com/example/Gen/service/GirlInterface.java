package com.example.Gen.service;

import com.example.Gen.module.Gf;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface GirlInterface
{

    public void create(@RequestBody Gf g);
    public List<Gf> getAll();
    public void update(@RequestBody Gf g);
    public void deleteById(@PathVariable int id);

}
