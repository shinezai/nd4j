/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package org.nd4j.linalg.api.ops.factory;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.LossFunction;
import org.nd4j.linalg.api.ops.TransformOp;
import org.nd4j.linalg.api.ops.impl.accum.*;
import org.nd4j.linalg.api.ops.impl.accum.distances.CosineSimilarity;
import org.nd4j.linalg.api.ops.impl.accum.distances.EuclideanDistance;
import org.nd4j.linalg.api.ops.impl.accum.distances.ManhattanDistance;
import org.nd4j.linalg.api.ops.impl.transforms.*;


/**
 * Default operations factory
 *
 * @author Adam Gibson
 */
public class DefaultOpFactory implements OpFactory {

    @Override
    public LossFunction createLossFunction(String name, INDArray x, INDArray y) {
        return null;
    }

    @Override
    public Accumulation createAccum(String name, INDArray x) {
        switch (name) {
            case "sum":
                return new Sum(x);
            case "max":
                return new Max(x);
            case "min":
                return new Min(x);
            case "norm1":
                return new Norm1(x);
            case "norm2":
                return new Norm2(x);
            case "prod":
                return new Prod(x);
            case "std":
                return new StandardDeviation(x);
            case "var":
                return new Variance(x);
            case "euclidean":
                return new EuclideanDistance(x);
            case "cosine":
                return new CosineSimilarity(x);
            case "manhattan":
                return new ManhattanDistance(x);

            default:
                throw new IllegalArgumentException("Illegal name " + name);
        }
    }

    @Override
    public Accumulation createAccum(String name, INDArray x, INDArray y, INDArray z) {
        switch (name) {
            case "sum":
                return new Sum(x, y, x.length());
            case "max":
                return new Max(x, y, x.length());
            case "min":
                return new Min(x, y, x.length());
            case "norm1":
                return new Norm1(x, y, x.length());
            case "norm2":
                return new Norm2(x, y, x.length());
            case "prod":
                return new Prod(x, y, x.length());
            case "std":
                return new StandardDeviation(x, y, x.length());
            case "var":
                return new Variance(x, y, x.length());
            case "euclidean":
                return new EuclideanDistance(x, y, x.length());
            case "cosine":
                return new CosineSimilarity(x, y, x.length());
            case "manhattan":
                return new ManhattanDistance(x, y, x.length());

            default:
                throw new IllegalArgumentException("Illegal name " + name);
        }
    }

    @Override
    public Accumulation createAccum(String name, INDArray x, INDArray y) {
        switch (name) {
            case "sum":
                return new Sum(x, y);
            case "max":
                return new Max(x, y);
            case "min":
                return new Min(x, y);
            case "norm1":
                return new Norm1(x, y);
            case "norm2":
                return new Norm2(x, y);
            case "prod":
                return new Prod(x, y);
            case "std":
                return new StandardDeviation(x, y);
            case "var":
                return new Variance(x, y);
            case "euclidean":
                return new EuclideanDistance(x, y, x.length());
            case "cosine":
                return new CosineSimilarity(x, y, x.length());
            case "manhattan":
                return new ManhattanDistance(x, y, x.length());

            default:
                throw new IllegalArgumentException("Illegal name " + name);
        }
    }

    @Override
    public TransformOp createTransform(String name, INDArray x, INDArray y) {
        switch (name) {
            case "relu":
                return new RectifedLinear(x,0);
            case "abs":
                return new Abs(x, y);
            case "acos":
                return new ACos(x, y);
            case "asin":
                return new ASin(x, y);
            case "atan":
                return new ATan(x, y);
            case "ceil":
                return new Ceil(x, y);
            case "cos":
                return new Cos(x, y);
            case "exp":
                return new Exp(x, y);
            case "floor":
                return new Floor(x, y);
            case "hardtanh":
                return new HardTanh(x, y);
            case "identity":
                return new Identity(x, y);
            case "log":
                return new Log(x, y);
            case "maxout":
                return new MaxOut(x, y);
            case "negative":
                return new Negative(x, y);
            case "pow":
                return new Pow(x, y, 2);
            case "round":
                return new Round(x, y);
            case "sigmoid":
                return new Sigmoid(x, y);
            case "sign":
                return new Sign(x, y);
            case "sin":
                return new Sin(x, y);
            case "sqrt":
                return new Sqrt(x, y);
            case "stabilize":
                return new Stabilize(x, y, 1);
            case "tanh":
                return new Tanh(x, y);
            case "softmax":
                return new SoftMax(x, y);
            default:
                throw new IllegalArgumentException("Illegal name " + name);
        }

    }

    @Override
    public TransformOp createTransform(String name, INDArray x) {
        switch (name) {
            case "relu":
                return new RectifedLinear(x,0);
            case "abs":
                return new Abs(x);
            case "acos":
                return new ACos(x);
            case "asin":
                return new ASin(x);
            case "atan":
                return new ATan(x);
            case "ceil":
                return new Ceil(x);
            case "cos":
                return new Cos(x);
            case "exp":
                return new Exp(x);
            case "floor":
                return new Floor(x);
            case "hardtanh":
                return new HardTanh(x);
            case "identity":
                return new Identity(x);
            case "log":
                return new Log(x);
            case "maxout":
                return new MaxOut(x);
            case "negative":
                return new Negative(x);
            case "pow":
                return new Pow(x, 2);
            case "round":
                return new Round(x);
            case "sigmoid":
                return new Sigmoid(x);
            case "sign":
                return new Sign(x);
            case "sin":
                return new Sin(x);
            case "sqrt":
                return new Sqrt(x);
            case "stabilize":
                return new Stabilize(x, 1);
            case "tanh":
                return new Tanh(x);
            case "softmax":
                return new SoftMax(x);

            default:
                throw new IllegalArgumentException("Illegal name " + name);
        }

    }

    @Override
    public TransformOp createTransform(String name, INDArray x, INDArray y, INDArray z) {
        switch (name) {
            case "relu":
                return new RectifedLinear(x,z,0);
            case "abs":
                return new Abs(x, z);
            case "acos":
                return new ACos(x, z);
            case "asin":
                return new ASin(x, z);
            case "atan":
                return new ATan(x, z);
            case "ceil":
                return new Ceil(x, z);
            case "cos":
                return new Cos(x, z);
            case "exp":
                return new Exp(x, z);
            case "floor":
                return new Floor(x, z);
            case "hardtanh":
                return new HardTanh(x, z);
            case "identity":
                return new Identity(x, z);
            case "log":
                return new Log(x, z);
            case "maxout":
                return new MaxOut(x, z);
            case "negative":
                return new Negative(x, z);
            case "pow":
                return new Pow(x, z, 2);
            case "round":
                return new Round(x, z);
            case "sigmoid":
                return new Sigmoid(x, z);
            case "sign":
                return new Sign(x, z);
            case "sin":
                return new Sin(x, z);
            case "sqrt":
                return new Sqrt(x, z);
            case "stabilize":
                return new Stabilize(x, z, 1);
            case "tanh":
                return new Tanh(x, z);
            case "softmax":
                return new SoftMax(x, z);

            default:
                throw new IllegalArgumentException("Illegal name " + name);
        }
    }


}
