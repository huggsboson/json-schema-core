/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.jsonschema.core.report;

/**
 * Base implementation of a {@link ReportProvider}
 *
 * <p>This base implementation takes a log level and exception threshold, and
 * generates a new processing report according to these parameters.</p>
 */
public abstract class AbstractReportProvider
    implements ReportProvider
{
    protected final LogLevel logLevel;
    protected final LogLevel exceptionThreshold;

    /**
     * Protected constructor
     *
     * @param logLevel the log level to use when generating a new report
     * @param exceptionThreshold the exception threshold to use
     */
    protected AbstractReportProvider(final LogLevel logLevel,
        final LogLevel exceptionThreshold)
    {
        this.logLevel = logLevel;
        this.exceptionThreshold = exceptionThreshold;
    }
}