package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public abstract boolean theSameAs(T item);
    public abstract boolean equals(Object item);
}