package ru.brandanalyst.analyzer.util;

import weka.core.Instances;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Alexandra Mikhaylova mikhaylova@yandex-team.ru
 */
public class ClassifierUtils {
    private static final Logger log = Logger.getLogger(ClassifierUtils.class.getName());

    // @todo: make sure it is an ARFF file OR:
    // @ todo think out how to built instances
    public static Instances getInstances(final String fileName) {
        try {
            return new Instances(new FileReader(fileName));
        } catch (IOException e) {
            log.info("Couldn't read training set from file: " + fileName);
            return null;
        }
    }

    public static enum Type {
        SVM_NEGATIVE,
        SVM_POSITIVE
    }
}