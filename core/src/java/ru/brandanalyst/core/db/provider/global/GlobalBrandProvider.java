package ru.brandanalyst.core.db.provider.global;

import ru.brandanalyst.core.model.Brand;

import java.util.List;

public interface GlobalBrandProvider {
    @Deprecated
    public void cleanDataStore();

    public void writeBrandToDataStore(Brand brand);

    public void writeListOfBrandsToDataStore(List<Brand> brands);

    public Brand getBrandByName(String name);

    public Brand getBrandById(long brandId);

    public List<Brand> getAllBrands();
}