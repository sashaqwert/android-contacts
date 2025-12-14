package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T> extends DiffUtil.ItemCallback<T> implements ListDiffInterface<T> {
    @Override
    public boolean theSameAs(T obj) {
        return this.hashCode() == obj.hashCode();
    }

    //При удалении метода ошибка
    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    //@Override //метод нужен???
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }
}
