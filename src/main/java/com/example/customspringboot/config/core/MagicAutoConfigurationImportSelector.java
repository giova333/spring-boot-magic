package com.example.customspringboot.config.core;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

class MagicAutoConfigurationImportSelector implements DeferredImportSelector, BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return SpringFactoriesLoader
            .loadFactoryNames(EnableMagicAutoConfiguration.class, this.classLoader)
            .toArray(new String[] {});
    }
}
