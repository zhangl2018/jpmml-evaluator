/*
 * Copyright (c) 2018 Villu Ruusmann
 *
 * This file is part of JPMML-Evaluator
 *
 * JPMML-Evaluator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPMML-Evaluator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with JPMML-Evaluator.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jpmml.evaluator;

import org.dmg.pmml.ComplexValue;

abstract
class Period<P extends Period<P>> extends Number implements ComplexValue, Comparable<P> {

	@Override
	public Long toSimpleValue(){
		return Long.valueOf(longValue());
	}

	@Override
	public int intValue(){
		long value = longValue();

		if(value < Integer.MIN_VALUE || value > Integer.MAX_VALUE){
			throw new UndefinedResultException();
		}

		return (int)value;
	}

	@Override
	public float floatValue(){
		return longValue();
	}

	@Override
	public double doubleValue(){
		return longValue();
	}
}