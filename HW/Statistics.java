/* Program Name: NumbersMain
 * Student Name: Xiaopei Tan
 * Student ID: 000-69-3762
 * NetID: xatn6
 * Description: This program is to 
 * Create the object class and its methods.*/

class Statistics {
    private int mNumValues;
    private int mSumOfValues;
    private int mProductOfValues;
    private int mMaximumValue;
    private int mMinimumValue;
//constructor
    public Statistics() {
        /* TODO: Write the constructor. 
        Add statements here to 'initialize' your private fields below */
        mNumValues = 0;
        mSumOfValues = 0;
        mProductOfValues = 1;
        mMaximumValue = 0;
        mMinimumValue = 0;
    }
    
    public int getSum() {
        return mSumOfValues;
    }

    public int getNumValues() {
        return mNumValues;
    }

    public int getProduct() {
        return mProductOfValues;
    }

    public int getMin() {
        return mMinimumValue;
    }

    public int getMax() {
        return mMaximumValue;
    }
    public void addValue(int val) {
        /* TODO: Add the value by incrementing the number of values
                member, adding the value to the sum, and multiplying
                the value to the product. */
        this.mSumOfValues += val;
        this.mProductOfValues *= val;
        this.mNumValues += 1;
        /* TODO: Reset the mMaximumValue to val if the value given is the biggest
                value ever seen
                Reset the mMinimumValue to val if the value given is the smallest
                value ever seen
                NOTE: A value cannot be both the minimum AND maximum simultaneously
                        unless there is only one value. Therefore, you MUST use
                        'mutual exclusion' for your if statements!!
        */
//if min or max value are 0 or no value enter yet, update it to current value. Then perform the regular find min and max.
        if (mMinimumValue == 0 && mMaximumValue == 0){
            this.mMinimumValue = val;
            this.mMaximumValue = val;
        }
        else if (val < mMinimumValue){
            this.mMinimumValue = val;
        }
        else if (val > mMaximumValue){
            this.mMaximumValue = val;
        }
    }
//get Average
    public double getAverage() {
        /* TODO: Return the average of the values seen. If there are no values,
                return 0.0 */
        if (mSumOfValues == 0){
            return 0.0;
        }else
            return mSumOfValues*1.0/mNumValues;
        }

    }
