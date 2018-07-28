package com.jay.daggerdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Jay on 28-07-2018.
 */

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface MyComponent {
    void inject(MainActivity activity);
}
