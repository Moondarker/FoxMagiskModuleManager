package com.fox2code.mmm.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class SentryBreadcrumb {
    public SentryBreadcrumb() {}

    public void setType(@Nullable String type) {}

    public void setData(@NotNull String key, @Nullable Object value) {
        Objects.requireNonNull(key);
    }

    public void setCategory(@Nullable String category) {}
}
