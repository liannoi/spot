package org.itstep.liannoi.spot.application.common.interfaces;

public interface Facade<TModel, TListViewModel> {
    void delete(int id);

    TListViewModel get();

    void create(TModel model);

    void clear();

    void mock();
}
