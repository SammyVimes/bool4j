package com.danilov.converter;

import ru.matlog.bool4j.expression.Expression;

public interface Converter {
	
	
	Expression convert(final Expression expression);
	
}
