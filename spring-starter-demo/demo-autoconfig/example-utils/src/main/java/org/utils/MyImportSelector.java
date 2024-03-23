package org.utils;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.NonNull;

public class MyImportSelector implements ImportSelector {
    public @NonNull String[] selectImports(@NonNull AnnotationMetadata importingClassMetadata) {
        return new String[]{"org.utils.HeaderConfig"};
    }
}
