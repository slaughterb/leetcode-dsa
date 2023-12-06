/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
  return fn => functions.reduceRight((acc, func) => func(acc), fn);
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */