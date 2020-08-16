package ru.alexpetrik;

import dagger.Component;

@Component(
        modules = {NetModule.class, AppModule.class}
)
public interface NetComponent {
    void inject(LoginActivity loginActivity);
}
