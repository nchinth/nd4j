---
layout: page
title: "ND4J Syntax"
description: ""
---
{% include JB/setup %}

|Method| Meaning| Type |
|:----------|:-------------:| ----:|
|abs(IComplexNDArray ndarray)| abs(x)|
|add(IComplexNumber c)|Add two complex numbers||
|addi(IComplexNumber c, IComplexNumber result)|Add two complex numbers in place||
|addi(IComplexNumber c)|Add two complex numbers in-place storing the result in this.||
|addi(Number a, IComplexNumber result)|Add a real component number to a complex number in place||
|applyDerivative(INDArray input)|Applies the derivative of a transform function to the param input|Activation|
|asDouble()|Convert complex number to a double||
|asFloat()|Convert this number to a float||
|complexArgument()|Returns the argument of a complex number||
|cosineSim(INDArray d1, INDArray d2)|Measures the cosine of the angle between two vectors of an inner product space||
|downSample(INDArray d1, int[] stride)|Decreases the sampling rate by integer factor (stride)|Signal processing|
|eigenvalues(INDArray A)|Computes the eigenvalues of a general matrix.|
|eigenvectors(INDArray A)|Computes the eigenvalues and eigenvectors of a general matrix. For matlab users note the following from their documentation: The columns of V present eigenvectors of A. The diagonal matrix D contains eigenvalues. This is in reverse order of Matlab's eig(A) call.|
|eq(INDArray ndArray)|Binary matrix of whether the number at a given index is equal||
|exp()|The e^x function|Activation|
|floor(INDArray ndArray)|Binary matrix of whether the number at a given index is greater than||
|hardTanh|Hard Tanh is tanh constraining input to -1 to 1|Activation|
|identity(INDArray ndArray)||Transform|
|linear()|Linear activation function, just returns the input as is|Activation|
|log(INDArray ndArray)|Log function||
|max(INDArray ndArray,double max)|Max function||
|maxout()|Max out activation: max of input(i,j)|Activation|
|maxPool(INDArray input,int[] ds,boolean ignoreBorder)|Max pooling|Transform|
|neq(INDArray ndArray)|Binary matrix of whether the number at a given index is equal||
|normalizeZeroMeanAndUnitVariance (INDArray toNormalize)|Normalize data to zero mean and unit variance: substract by the mean and divide by the standard deviation||
|pool(INDArray toPool,int[] stride)|Pooled expectations|Transform|
|pow(INDArray ndArray,Number power)|Power function||
|rectifiedLinear()|Rectified linear, the output: rounded|Activation|
|roundedlinear()|Rounded linear, the output: rounded|Activation|
|tanh()|Hyperbolic tangent: a sigmoidal function|Activation|
|sigmoid()|An s-shaped function for logistic regression|Activation|
|sign(IComplexNDArray toSign)|Signum function of this ndarray||
|softmax()|Softmax function used for multinomial classification|Activation|
|softMaxRows()|Softmax with row wise features|Activation|
|sqrt(IComplexNDArray ndArray)|Takes the square root||
|subi(IComplexNumber c, IComplexNumber result)|Subtract two complex numbers in place||
|symmetricGeneralizedEigenvalues (INDArray A)|Computes generalized eigenvalues of the problem A x = L B x.|
|symmetricGeneralizedEigenvalues (INDArray A, INDArray B)|Compute generalized eigenvalues of the problem A x = L B x.|
|unitVec|Scale by 1 / norm2 of the matrix||
|upSample(INDArray d, INDArray scale)|Upsampling a signal (specifically the first 2 dimensions)|Signal processing|

If you do not understand the explanation of ND4J's syntax, cannot find a definition for a method, or would like to request that a function be added, please let us know on the [ND4J Google Group](https://groups.google.com/forum/#!forum/nd4j).